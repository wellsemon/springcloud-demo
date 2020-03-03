package com.semon.spring.cloud.service.consumer.controller;

import com.semon.spring.cloud.service.consumer.service.feign.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private HiService hiService;

    @GetMapping("/hello/{uname}")
    public String helloUname(@PathVariable String uname) {
        return hiService.hi(uname);
    }

    @GetMapping("/hello")
    public String hello(String count) {
        return hiService.hi(count);
    }
}
