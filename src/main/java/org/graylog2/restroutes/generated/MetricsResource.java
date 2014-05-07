
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class MetricsResource {


    public PathMethod metrics() {
        return new PathMethod("GET", "/system/metrics");
    }

    public PathMethod metricNames() {
        return new PathMethod("GET", "/system/metrics/names");
    }

    public PathMethod singleMetric(String metricName) {
        return new PathMethod("GET", "/system/metrics/"+metricName+"");
    }

    public PathMethod multipleMetrics() {
        return new PathMethod("POST", "/system/metrics/multiple");
    }

    public PathMethod byNamespace(String namespace) {
        return new PathMethod("GET", "/system/metrics/namespace/"+namespace+"");
    }

    public PathMethod historicSingleMetric(String metricName) {
        return new PathMethod("GET", "/system/metrics/"+metricName+"/history");
    }

}
