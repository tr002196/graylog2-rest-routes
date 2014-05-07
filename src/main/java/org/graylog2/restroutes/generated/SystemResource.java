
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class SystemResource {


    public PathMethod shutdown() {
        return new PathMethod("POST", "/system/shutdown");
    }

    public PathMethod permissions() {
        return new PathMethod("GET", "/system/permissions");
    }

    public PathMethod system() {
        return new PathMethod("GET", "/system");
    }

    public PathMethod fields() {
        return new PathMethod("GET", "/system/fields");
    }

    public PathMethod pauseProcessing() {
        return new PathMethod("PUT", "/system/processing/pause");
    }

    public PathMethod resumeProcessing() {
        return new PathMethod("PUT", "/system/processing/resume");
    }

    public PathMethod unlockProcessingPause() {
        return new PathMethod("PUT", "/system/processing/pause/unlock");
    }

    public PathMethod jvm() {
        return new PathMethod("GET", "/system/jvm");
    }

    public PathMethod threaddump() {
        return new PathMethod("GET", "/system/threaddump");
    }

    public PathMethod readerPermissions(String username) {
        return new PathMethod("GET", "/system/permissions/reader/"+username+"");
    }

}
