
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class NotificationsResource {


    public PathMethod listNotifications() {
        return new PathMethod("GET", "/system/notifications");
    }

    public PathMethod deleteNotification(String notificationType) {
        return new PathMethod("DELETE", "/system/notifications/"+notificationType+"");
    }

}
