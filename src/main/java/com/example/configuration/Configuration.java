package com.example.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * Created by Theerut on 10/9/2016 AD.
 */
@RefreshScope
@Component
public class Configuration {

    @Value("${message:Hello default}")
    private String message;

    @Value("${config: default}")
    private String configSomething;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getConfigSomething() {
        return configSomething;
    }

    public void setConfigSomething(String configSomething) {
        this.configSomething = configSomething;
    }
}
