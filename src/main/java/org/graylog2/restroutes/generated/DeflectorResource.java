
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class DeflectorResource {


    public PathMethod cycle() {
        return new PathMethod("POST", "/system/deflector/cycle");
    }

    public PathMethod config() {
        return new PathMethod("GET", "/system/deflector/config");
    }

    public PathMethod deflector() {
        return new PathMethod("GET", "/system/deflector");
    }

}
