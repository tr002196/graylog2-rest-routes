
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class StreamAlertResource {


    public PathMethod list(String streamId) {
        return new PathMethod("GET", "/streams/"+streamId+"/alerts");
    }

    public PathMethod list(String streamId, String conditionId) {
        return new PathMethod("DELETE", "/streams/"+streamId+"/alerts/conditions/"+conditionId+"");
    }

    public PathMethod create(String streamId) {
        return new PathMethod("POST", "/streams/"+streamId+"/alerts/conditions");
    }

    public PathMethod checkConditions(String streamId) {
        return new PathMethod("GET", "/streams/"+streamId+"/alerts/check");
    }

    public PathMethod listConditions(String streamId) {
        return new PathMethod("GET", "/streams/"+streamId+"/alerts/conditions");
    }

    public PathMethod addReceiver(String streamId) {
        return new PathMethod("POST", "/streams/"+streamId+"/alerts/receivers");
    }

    public PathMethod removeReceiver(String streamId) {
        return new PathMethod("DELETE", "/streams/"+streamId+"/alerts/receivers");
    }

    public PathMethod sendDummyAlert(String streamId) {
        return new PathMethod("GET", "/streams/"+streamId+"/alerts/sendDummyAlert");
    }

}
