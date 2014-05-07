
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class StreamResource {


    public PathMethod get() {
        return new PathMethod("GET", "/streams");
    }

    public PathMethod get(String streamId) {
        return new PathMethod("GET", "/streams/"+streamId+"");
    }

    public PathMethod resume(String streamId) {
        return new PathMethod("POST", "/streams/"+streamId+"/resume");
    }

    public PathMethod delete(String streamId) {
        return new PathMethod("DELETE", "/streams/"+streamId+"");
    }

    public PathMethod create() {
        return new PathMethod("POST", "/streams");
    }

    public PathMethod update(String streamId) {
        return new PathMethod("PUT", "/streams/"+streamId+"");
    }

    public PathMethod getEnabled() {
        return new PathMethod("GET", "/streams/enabled");
    }

    public PathMethod pause(String streamId) {
        return new PathMethod("POST", "/streams/"+streamId+"/pause");
    }

    public PathMethod testMatch(String streamId) {
        return new PathMethod("POST", "/streams/"+streamId+"/testMatch");
    }

    public PathMethod cloneStream(String streamId) {
        return new PathMethod("POST", "/streams/"+streamId+"/clone");
    }

    public PathMethod oneStreamThroughput(String streamId) {
        return new PathMethod("GET", "/streams/"+streamId+"/throughput");
    }

    public PathMethod streamThroughput() {
        return new PathMethod("GET", "/streams/throughput");
    }

}
