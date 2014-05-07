
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class LoadBalancerStatusResource {


    public PathMethod override(String status) {
        return new PathMethod("PUT", "/system/lbstatus/override/"+status+"");
    }

    public PathMethod status() {
        return new PathMethod("GET", "/system/lbstatus");
    }

}
