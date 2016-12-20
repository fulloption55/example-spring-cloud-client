package com.example.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.endpoint.RefreshEndpoint;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class ConfigurationJob {

    @Autowired
    private RefreshEndpoint refreshEndpoint;

    @Scheduled(cron = "*/10 * * * * *")
    public void autoRefreshConfiguration() {
        refreshEndpoint.refresh();
    }
}

