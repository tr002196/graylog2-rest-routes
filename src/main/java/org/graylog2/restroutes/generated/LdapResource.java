
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class LdapResource {


    public PathMethod getLdapSettings() {
        return new PathMethod("GET", "/system/ldap/settings");
    }

    public PathMethod testLdapConfiguration() {
        return new PathMethod("POST", "/system/ldap/test");
    }

    public PathMethod updateLdapSettings() {
        return new PathMethod("PUT", "/system/ldap/settings");
    }

    public PathMethod deleteLdapSettings() {
        return new PathMethod("DELETE", "/system/ldap/settings");
    }

}
