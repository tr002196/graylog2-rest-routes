
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class FailuresResource {


    public PathMethod count() {
        return new PathMethod("GET", "/system/indexer/failures/count");
    }

    public PathMethod single() {
        return new PathMethod("GET", "/system/indexer/failures");
    }

}
