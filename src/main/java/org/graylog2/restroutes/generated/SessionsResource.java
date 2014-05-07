
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class SessionsResource {


    public PathMethod newSession() {
        return new PathMethod("POST", "/system/sessions");
    }

    public PathMethod terminateSession(String sessionId) {
        return new PathMethod("DELETE", "/system/sessions/"+sessionId+"");
    }

}
