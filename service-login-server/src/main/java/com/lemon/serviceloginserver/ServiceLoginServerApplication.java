package com.lemon.serviceloginserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceLoginServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceLoginServerApplication.class, args);
    }

}
