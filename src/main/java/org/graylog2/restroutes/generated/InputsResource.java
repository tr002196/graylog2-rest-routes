
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class InputsResource {


    public PathMethod stop(String inputId) {
        return new PathMethod("GET", "/system/inputs/"+inputId+"/stop");
    }

    public PathMethod list() {
        return new PathMethod("GET", "/system/inputs");
    }

    public PathMethod create() {
        return new PathMethod("POST", "/system/inputs");
    }

    public PathMethod types() {
        return new PathMethod("GET", "/system/inputs/types");
    }

    public PathMethod info(String inputType) {
        return new PathMethod("GET", "/system/inputs/types/"+inputType+"");
    }

    public PathMethod single(String inputId) {
        return new PathMethod("GET", "/system/inputs/"+inputId+"");
    }

    public PathMethod terminate(String inputId) {
        return new PathMethod("DELETE", "/system/inputs/"+inputId+"");
    }

    public PathMethod launchExisting(String inputId) {
        return new PathMethod("GET", "/system/inputs/"+inputId+"/launch");
    }

    public PathMethod restart(String inputId) {
        return new PathMethod("GET", "/system/inputs/"+inputId+"/restart");
    }

}
