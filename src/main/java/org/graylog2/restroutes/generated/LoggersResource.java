
package org.graylog2.restroutes.generated;

import org.graylog2.restroutes.PathMethod;

public class LoggersResource {


    public PathMethod loggers() {
        return new PathMethod("GET", "/system/loggers");
    }

    public PathMethod subsytems() {
        return new PathMethod("GET", "/system/loggers/subsystems");
    }

    public PathMethod setSubsystemLoggerLevel(String subsystem, String level) {
        return new PathMethod("PUT", "/system/loggers/subsystems/"+subsystem+"/level/"+level+"");
    }

    public PathMethod setSingleLoggerLevel(String loggerName, String level) {
        return new PathMethod("PUT", "/system/loggers/"+loggerName+"/level/"+level+"");
    }

}
