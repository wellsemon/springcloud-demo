package com.semon.spring.cloud.eureka.client.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiApi {
    private static final Logger LOG = LoggerFactory.getLogger(HiApi.class.getName());

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String count) throws InterruptedException {
        long time = System.currentTimeMillis();
        LOG.info("running:" + time + "; count:" + count);
        Thread.sleep(5000);
        return "hi:" + time;
    }

}
