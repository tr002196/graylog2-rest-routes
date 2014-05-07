
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class StaticFieldsResource {


    public PathMethod delete(String key, String inputId) {
        return new PathMethod("DELETE", "/system/inputs/"+inputId+"/staticfields/"+key+"");
    }

    public PathMethod create(String inputId) {
        return new PathMethod("POST", "/system/inputs/"+inputId+"/staticfields");
    }

}
