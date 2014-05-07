
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class IndexRangesResource {


    public PathMethod list() {
        return new PathMethod("GET", "/system/indices/ranges");
    }

    public PathMethod rebuild() {
        return new PathMethod("POST", "/system/indices/ranges/rebuild");
    }

}
