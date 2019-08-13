package com.lemon.servicehelloapi.controller;

import com.lemon.servicehelloapi.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 *
 * @author lemon
 * @date 2019-08-13 10:29:06 创建
 */
@RestController
@RequestMapping("helloController")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("say")
    public String say(){
        return helloService.say();
    }
}
