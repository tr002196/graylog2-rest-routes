
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class ClusterResource {


    public PathMethod clusterName() {
        return new PathMethod("GET", "/system/indexer/cluster/name");
    }

    public PathMethod clusterHealth() {
        return new PathMethod("GET", "/system/indexer/cluster/health");
    }

}
