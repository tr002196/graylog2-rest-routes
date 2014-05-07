package org.graylog2.restroutes;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.sun.codemodel.*;
import org.graylog2.rest.resources.RestResource;
import org.reflections.Reflections;

import javax.ws.rs.*;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Dennis Oelkers <dennis@torch.sh>
 */
public class GenerateRoutes {
    private static final String packagePrefix = "org.graylog2.restroutes.generated";

    private static Set<Class<?>> httpMethods() {
        Set<Class<?>> methods = Sets.newHashSet();
        methods.add(GET.class);
        methods.add(POST.class);
        methods.add(PUT.class);
        methods.add(DELETE.class);

        return methods;
    }

    private static Class<?> httpMethodOfMethod(Method method) {
        for (Class methodAnn : httpMethods()) {
            if (method.getAnnotation(methodAnn) != null)
                return methodAnn;
        }

        return null;
    }

    public static void main(String[] argv) {
        // Just "touching" class in server jar so it gets loaded.
        RestResource resource = null;

        JCodeModel codeModel = new JCodeModel();

        Reflections ref = new Reflections("org.graylog2");
        Set<Class<?>> classes = ref.getTypesAnnotatedWith(Path.class);

        List<RouteClass> routeClassList = Lists.newArrayList();

        for (Class<?> klazz : classes) {
            Path pathAnn = klazz.getAnnotation(Path.class);
            if (pathAnn == null)
                continue;

            String path = pathAnn.value();

            RouteClass routeClass = new RouteClass(klazz, path);
            routeClassList.add(routeClass);

            for (Method method : klazz.getMethods()) {
                Set<Annotation> anns = Sets.newHashSet(method.getAnnotations());
                Class<?> httpMethod = httpMethodOfMethod(method);

                if (httpMethod == null)
                    continue;

                Path ann = method.getAnnotation(Path.class);

                StringBuilder buildPath = new StringBuilder(path);

                if (ann != null) {
                    String methodPath = ann.value();
                    if (!path.endsWith("/") && !methodPath.startsWith("/"))
                        buildPath.append("/");

                    buildPath.append(methodPath);
                }
                //System.out.println(httpMethod.getSimpleName() + "\t\t" + buildPath + ": " + klazz.getSimpleName() + "." + method.getName());
                Map<PathParam, Class<?>> pathParamTypeMap = Maps.newLinkedHashMap(); // Using a linked hash map due to its preservation insertion order
                int i = 0;
                for (Annotation[] annotations : method.getParameterAnnotations()) {
                    for (Annotation annotation :annotations)
                        if (annotation instanceof PathParam) {
                            final Class<?> type = method.getParameterTypes()[i];
                            pathParamTypeMap.put((PathParam) annotation, type);
                        }
                    i++;
                }

                Route route = new Route(httpMethod.getSimpleName(), buildPath.toString(), klazz, method, pathParamTypeMap);
                routeClass.addRoute(route);
            }
        }

        JDefinedClass router = null;
        try {
            router = codeModel._class(packagePrefix + ".routes");
        } catch (JClassAlreadyExistsException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        ClassGenerator generator = new ClassGenerator(packagePrefix, codeModel);
        for (RouteClass routeClass : routeClassList) {
            JDefinedClass definedClass = generator.generate(routeClass);
            if (definedClass != null) {
                JMethod method = router.method(JMod.PUBLIC | JMod.STATIC, definedClass, routeClass.getKlazz().getSimpleName());
                JBlock block = method.body();
                block.directStatement("return new " + routeClass.getKlazz().getSimpleName() + "();");
            }
        }


        try {
            File dest = new File("src/main/java");
            codeModel.build(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
