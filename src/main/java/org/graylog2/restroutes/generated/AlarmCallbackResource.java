
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class AlarmCallbackResource {


    public PathMethod get(String streamid, String alarmCallbackId) {
        return new PathMethod("GET", "/streams/"+streamid+"/alarmcallbacks/"+alarmCallbackId+"");
    }

    public PathMethod get(String streamid) {
        return new PathMethod("GET", "/streams/"+streamid+"/alarmcallbacks");
    }

    public PathMethod delete(String streamid, String alarmCallbackId) {
        return new PathMethod("DELETE", "/streams/"+streamid+"/alarmcallbacks/"+alarmCallbackId+"");
    }

    public PathMethod available(String streamid) {
        return new PathMethod("GET", "/streams/"+streamid+"/alarmcallbacks/available");
    }

    public PathMethod create(String streamid) {
        return new PathMethod("POST", "/streams/"+streamid+"/alarmcallbacks");
    }

}
