package com.semon.spring.cloud.service.consumer.service.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by suzw1 on 2018/09/21.
 */
@Component
@FeignClient("eureka-client")
public interface HiService {
    @GetMapping(value = "/hi/{uname}")
    public String hiUname(@PathVariable("uname") String uname);

    @GetMapping(value = "/hi")
    public String hi(@RequestParam("count") String count);
}
