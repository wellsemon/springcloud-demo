package com.semon.spring.cloud.service.consumer.controller;

import com.semon.spring.cloud.service.consumer.service.feign.ClientAFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientAController {
    @Autowired
    private ClientAFeign clientAFeign;

    @GetMapping("/a/hello/{uname}")
    public String helloUname(@PathVariable String uname) {
        return clientAFeign.hi(uname);
    }

    @GetMapping("/a/hello")
    public String hello(String count) {
        return clientAFeign.hi(count);
    }
}
