package com.lemon.servicehelloapi.service;

import org.springframework.stereotype.Component;

/**
 * description: 熔断器
 *
 * @author lemon
 * @date 2019-08-13 10:39:06 创建
 */
@Component
public class HelloServiceFallback implements HelloService{
    @Override
    public String say() {
        return "出错啦，访问不到！！";
    }
}
