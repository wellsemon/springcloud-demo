package com.semon.spring.cloud.eureka.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping({"/hi", "/hello"})
    public String hi() {
        return "hello, I'm c";
    }
}
