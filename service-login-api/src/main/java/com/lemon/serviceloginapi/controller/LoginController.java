package com.lemon.serviceloginapi.controller;

import com.lemon.api.vo.UserInfo;
import com.lemon.framework.context.RequestContext;
import com.lemon.serviceloginapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * description:
 *
 * @author lemon
 * @date 2019-08-12 17:23:06 创建
 */
@RestController
@RequestMapping("loginController")
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("login")
    public String login(UserInfo userInfo){
        UserInfo user = userService.getUser(userInfo.getUsername());
        if(!userInfo.getPassword().equals(user.getPassword())){
            return "登录失败";
        }

        RequestContext.setSessionUser(user);
        return "登录成功";
    }

    @GetMapping("getSession")
    public UserInfo getSession(){
        return (UserInfo) RequestContext.getSessionUser();
    }
}
