package com.lemon.servicehelloapi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * description:
 *
 * @author lemon
 * @date 2019-08-13 10:29:06 创建
 */
@FeignClient(value = "service-hello-server")
@Component
public interface HelloService {

    @GetMapping("say")
    String say();
}
