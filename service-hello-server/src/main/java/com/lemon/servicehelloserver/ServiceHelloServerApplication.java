package com.lemon.servicehelloserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableEurekaClient
@EnableRedisHttpSession
public class ServiceHelloServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHelloServerApplication.class, args);
    }

}
