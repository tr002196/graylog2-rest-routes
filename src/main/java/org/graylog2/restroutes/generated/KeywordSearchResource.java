
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class KeywordSearchResource {


    public PathMethod searchKeyword() {
        return new PathMethod("GET", "/search/universal/keyword");
    }

    public PathMethod histogramKeyword() {
        return new PathMethod("GET", "/search/universal/keyword/histogram");
    }

    public PathMethod termsKeyword() {
        return new PathMethod("GET", "/search/universal/keyword/terms");
    }

    public PathMethod statsKeyword() {
        return new PathMethod("GET", "/search/universal/keyword/stats");
    }

    public PathMethod fieldHistogramKeyword() {
        return new PathMethod("GET", "/search/universal/keyword/fieldhistogram");
    }

}
