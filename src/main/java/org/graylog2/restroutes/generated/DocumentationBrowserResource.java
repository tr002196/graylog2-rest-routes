
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class DocumentationBrowserResource {


    public PathMethod root() {
        return new PathMethod("GET", "/api-browser");
    }

    public PathMethod asset(String route) {
        return new PathMethod("GET", "/api-browser/{route: .*}");
    }

}
