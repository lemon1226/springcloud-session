package com.lemon.serviceloginapi.service;

import com.lemon.api.vo.UserInfo;
import com.lemon.vo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * description:
 *
 * @author lemon
 * @date 2019-08-12 17:24:06 创建
 */
@FeignClient("service-login-server")
@Component
public interface UserService {

    @GetMapping("login/getUser")
    UserInfo getUser(@RequestParam(value = "username") String username);
}
