
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class DocumentationResource {


    public PathMethod route(String route) {
        return new PathMethod("GET", "/api-docs/{route: .+}");
    }

    public PathMethod overview() {
        return new PathMethod("GET", "/api-docs");
    }

}
