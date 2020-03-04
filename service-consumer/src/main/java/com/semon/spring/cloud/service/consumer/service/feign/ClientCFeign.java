package com.semon.spring.cloud.service.consumer.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client-c")
public interface ClientCFeign {
    @GetMapping("/hi")
    String hi();
}
