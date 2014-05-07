
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class UsersResource {


    public PathMethod get(String username) {
        return new PathMethod("GET", "/users/"+username+"");
    }

    public PathMethod create() {
        return new PathMethod("POST", "/users");
    }

    public PathMethod listUsers() {
        return new PathMethod("GET", "/users");
    }

    public PathMethod changeUser(String username) {
        return new PathMethod("PUT", "/users/"+username+"");
    }

    public PathMethod deleteUser(String username) {
        return new PathMethod("DELETE", "/users/"+username+"");
    }

    public PathMethod editPermissions(String username) {
        return new PathMethod("PUT", "/users/"+username+"/permissions");
    }

    public PathMethod deletePermissions(String username) {
        return new PathMethod("DELETE", "/users/"+username+"/permissions");
    }

    public PathMethod changePassword(String username) {
        return new PathMethod("PUT", "/users/"+username+"/password");
    }

    public PathMethod listTokens(String username) {
        return new PathMethod("GET", "/users/"+username+"/tokens");
    }

    public PathMethod generateNewToken(String username, String name) {
        return new PathMethod("POST", "/users/"+username+"/tokens/"+name+"");
    }

    public PathMethod revokeToken(String username, String token) {
        return new PathMethod("DELETE", "/users/"+username+"/tokens/"+token+"");
    }

}
