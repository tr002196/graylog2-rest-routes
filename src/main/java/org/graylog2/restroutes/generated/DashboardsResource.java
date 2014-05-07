
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class DashboardsResource {


    public PathMethod remove(String dashboardId, String widgetId) {
        return new PathMethod("DELETE", "/dashboards/"+dashboardId+"/widgets/"+widgetId+"");
    }

    public PathMethod get(String dashboardId) {
        return new PathMethod("GET", "/dashboards/"+dashboardId+"");
    }

    public PathMethod list() {
        return new PathMethod("GET", "/dashboards");
    }

    public PathMethod delete(String dashboardId) {
        return new PathMethod("DELETE", "/dashboards/"+dashboardId+"");
    }

    public PathMethod create() {
        return new PathMethod("POST", "/dashboards");
    }

    public PathMethod update(String dashboardId) {
        return new PathMethod("PUT", "/dashboards/"+dashboardId+"");
    }

    public PathMethod setPositions(String dashboardId) {
        return new PathMethod("PUT", "/dashboards/"+dashboardId+"/positions");
    }

    public PathMethod addWidget(String dashboardId) {
        return new PathMethod("POST", "/dashboards/"+dashboardId+"/widgets");
    }

    public PathMethod widgetValue(String dashboardId, String widgetId) {
        return new PathMethod("GET", "/dashboards/"+dashboardId+"/widgets/"+widgetId+"/value");
    }

    public PathMethod updateDescription(String dashboardId, String widgetId) {
        return new PathMethod("PUT", "/dashboards/"+dashboardId+"/widgets/"+widgetId+"/description");
    }

    public PathMethod updateCacheTime(String dashboardId, String widgetId) {
        return new PathMethod("PUT", "/dashboards/"+dashboardId+"/widgets/"+widgetId+"/cachetime");
    }

}
