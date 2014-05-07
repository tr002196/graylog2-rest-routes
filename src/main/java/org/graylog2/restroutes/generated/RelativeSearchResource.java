
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class RelativeSearchResource {


    public PathMethod searchRelative() {
        return new PathMethod("GET", "/search/universal/relative");
    }

    public PathMethod termsRelative() {
        return new PathMethod("GET", "/search/universal/relative/terms");
    }

    public PathMethod statsRelative() {
        return new PathMethod("GET", "/search/universal/relative/stats");
    }

    public PathMethod histogramRelative() {
        return new PathMethod("GET", "/search/universal/relative/histogram");
    }

    public PathMethod fieldHistogramRelative() {
        return new PathMethod("GET", "/search/universal/relative/fieldhistogram");
    }

}
