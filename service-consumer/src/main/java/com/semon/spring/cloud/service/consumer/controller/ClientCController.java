package com.semon.spring.cloud.service.consumer.controller;

import com.semon.spring.cloud.service.consumer.service.feign.ClientCFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientCController {
    @Autowired
    private ClientCFeign clientCFeign;

    @GetMapping("/c/hi")
    public String hi() {
        return clientCFeign.hi();
    }
}
