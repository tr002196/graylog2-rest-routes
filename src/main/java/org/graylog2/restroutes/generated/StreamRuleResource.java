
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class StreamRuleResource {


    public PathMethod get(String streamid) {
        return new PathMethod("GET", "/streams/"+streamid+"/rules");
    }

    public PathMethod get(String streamid, String streamRuleId) {
        return new PathMethod("GET", "/streams/"+streamid+"/rules/"+streamRuleId+"");
    }

    public PathMethod delete(String streamid, String streamRuleId) {
        return new PathMethod("DELETE", "/streams/"+streamid+"/rules/"+streamRuleId+"");
    }

    public PathMethod create(String streamid) {
        return new PathMethod("POST", "/streams/"+streamid+"/rules");
    }

    public PathMethod update(String streamid, String streamRuleId) {
        return new PathMethod("POST", "/streams/"+streamid+"/rules/"+streamRuleId+"");
    }

}
