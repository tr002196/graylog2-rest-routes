
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class RadiosResource {


    public PathMethod radios() {
        return new PathMethod("GET", "/system/radios");
    }

    public PathMethod radio(String radioId) {
        return new PathMethod("GET", "/system/radios/"+radioId+"");
    }

    public PathMethod registerInput(String radioId) {
        return new PathMethod("POST", "/system/radios/"+radioId+"/inputs");
    }

    public PathMethod ping(String radioId) {
        return new PathMethod("PUT", "/system/radios/"+radioId+"/ping");
    }

    public PathMethod unregisterInput(String radioId, String inputId) {
        return new PathMethod("DELETE", "/system/radios/"+radioId+"/inputs/"+inputId+"");
    }

    public PathMethod persistedInputs(String radioId) {
        return new PathMethod("GET", "/system/radios/"+radioId+"/inputs");
    }

}
