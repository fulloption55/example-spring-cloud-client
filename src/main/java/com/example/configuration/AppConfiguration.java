package com.example.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * Created by Theerut on 10/9/2016 AD.
 */
@RefreshScope
@Component
public class AppConfiguration {


    @Value("${message:Hello default}")
    private String message;

    @Value("${config: default}")
    private String configSomething;

    @Value("${allenvi}")
    private String allenvi;

    @Value("${con1}")
    private String con1;

    @Value("${con2}")
    private String con2;


    public String getMessage() {
        return message;
    }

    public String getConfigSomething() {
        return configSomething;
    }

    public String getAllenvi() {
        return allenvi;
    }

    public String getCon1() {
        return con1;
    }

    public String getCon2() {
        return con2;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "message='" + message + '\'' +
                ", configSomething='" + configSomething + '\'' +
                ", allenvi='" + allenvi + '\'' +
                ", con1='" + con1 + '\'' +
                ", con2='" + con2 + '\'' +
                '}';
    }
}
