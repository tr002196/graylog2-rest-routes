
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class SystemJobResource {


    public PathMethod get(String jobId) {
        return new PathMethod("GET", "/system/jobs/"+jobId+"");
    }

    public PathMethod trigger() {
        return new PathMethod("POST", "/system/jobs");
    }

    public PathMethod list() {
        return new PathMethod("GET", "/system/jobs");
    }

}
