package com.lemon.serviceloginserver.controller;

import com.lemon.api.vo.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: 登录控制器
 *
 * @author lemon
 * @date 2019-08-12 16:58:06 创建
 */
@RestController
@RequestMapping("login")
public class UserController {

    @GetMapping("getUser")
    public UserInfo getUser(String username){
        UserInfo user = new UserInfo();
        if(username.equals("admin")){
            user.setUsername(username);
            user.setPassword("123456");
        }
        return user;
    }
}
