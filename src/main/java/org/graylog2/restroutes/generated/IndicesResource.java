
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class IndicesResource {


    public PathMethod close(String index) {
        return new PathMethod("POST", "/system/indexer/indices/"+index+"/close");
    }

    public PathMethod delete(String index) {
        return new PathMethod("DELETE", "/system/indexer/indices/"+index+"");
    }

    public PathMethod closed() {
        return new PathMethod("GET", "/system/indexer/indices/closed");
    }

    public PathMethod single(String index) {
        return new PathMethod("GET", "/system/indexer/indices/"+index+"");
    }

    public PathMethod reopen(String index) {
        return new PathMethod("POST", "/system/indexer/indices/"+index+"/reopen");
    }

}
