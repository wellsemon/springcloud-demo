package com.semon.spring.cloud.service.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient(autoRegister = true)
@EnableFeignClients
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
