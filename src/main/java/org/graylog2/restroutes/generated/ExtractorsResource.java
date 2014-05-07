
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class ExtractorsResource {


    public PathMethod list(String inputId) {
        return new PathMethod("GET", "/system/inputs/"+inputId+"/extractors");
    }

    public PathMethod order(String inputId) {
        return new PathMethod("POST", "/system/inputs/"+inputId+"/extractors/order");
    }

    public PathMethod create(String inputId) {
        return new PathMethod("POST", "/system/inputs/"+inputId+"/extractors");
    }

    public PathMethod terminate(String inputId, String extractorId) {
        return new PathMethod("DELETE", "/system/inputs/"+inputId+"/extractors/"+extractorId+"");
    }

}
