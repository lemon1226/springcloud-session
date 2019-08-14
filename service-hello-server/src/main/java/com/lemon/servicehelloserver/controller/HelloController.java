package com.lemon.servicehelloserver.controller;

import com.lemon.api.vo.UserInfo;
import com.lemon.framework.context.RequestContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * description:
 *
 * @author lemon
 * @date 2019-08-13 10:41:06 创建
 */
@RestController
public class HelloController {

    @GetMapping("say")
    public String say(){
        return "你好, " + ((UserInfo)RequestContext.getSessionUser()).getUsername();
    }
}
