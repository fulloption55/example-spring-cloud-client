package com.example.controller;

import com.example.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MessageRestController {

    @Autowired
    private Configuration configuration;

    @RequestMapping("/message")
    String getMessage() {
        return configuration.getMessage() + " " + configuration.getConfigSomething();
    }
}