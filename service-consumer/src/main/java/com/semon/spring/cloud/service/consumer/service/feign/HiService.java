package com.semon.spring.cloud.service.consumer.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient("eureka-client-a")
public interface HiService {
    @GetMapping(value = "/hi/{uname}")
    String hiUname(@PathVariable("uname") String uname);

    @GetMapping(value = "/hi")
    String hi(@RequestParam("count") String count);
}
