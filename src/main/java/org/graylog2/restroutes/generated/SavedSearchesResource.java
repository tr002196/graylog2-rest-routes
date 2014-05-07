
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class SavedSearchesResource {


    public PathMethod get(String searchId) {
        return new PathMethod("GET", "/search/saved/"+searchId+"");
    }

    public PathMethod list() {
        return new PathMethod("GET", "/search/saved");
    }

    public PathMethod delete(String searchId) {
        return new PathMethod("DELETE", "/search/saved/"+searchId+"");
    }

    public PathMethod create() {
        return new PathMethod("POST", "/search/saved");
    }

}
