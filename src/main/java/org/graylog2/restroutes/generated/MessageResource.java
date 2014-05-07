
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class MessageResource {


    public PathMethod search(String index, String messageId) {
        return new PathMethod("GET", "/messages/"+index+"/"+messageId+"");
    }

    public PathMethod analyze(String index) {
        return new PathMethod("GET", "/messages/"+index+"/analyze");
    }

}
