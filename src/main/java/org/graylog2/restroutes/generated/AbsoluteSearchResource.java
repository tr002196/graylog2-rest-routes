
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class AbsoluteSearchResource {


    public PathMethod searchAbsolute() {
        return new PathMethod("GET", "/search/universal/absolute");
    }

    public PathMethod termsAbsolute() {
        return new PathMethod("GET", "/search/universal/absolute/terms");
    }

    public PathMethod statsAbsolute() {
        return new PathMethod("GET", "/search/universal/absolute/stats");
    }

    public PathMethod histogramAbsolute() {
        return new PathMethod("GET", "/search/universal/absolute/histogram");
    }

    public PathMethod fieldHistogramAbsolute() {
        return new PathMethod("GET", "/search/universal/absolute/fieldhistogram");
    }

}
