package com.example.controller;

import com.example.configuration.AppConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class TestController {

    @Autowired
    private AppConfiguration configuration;

    @RequestMapping("/message")
    String getMessage() {
        return configuration.toString();
    }

}