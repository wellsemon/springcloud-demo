package com.semon.spring.cloud.eureka.client.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by suzw1 on 2018/09/21.
 */
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

    @GetMapping(value = "/hi/{uname}")
    public String hiUname(@PathVariable String uname) {
        return "hi, " + uname;
    }

    @GetMapping(value = "/hello")
    public String Hello() {
        return "hello";
    }

    @GetMapping(value = "/hai")
    public String Hi() {
        return "hai";
    }
}
