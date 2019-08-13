package com.lemon.servicehelloserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.web.http.HeaderHttpSessionIdResolver;

/**
 * description: 这是为了应对feign从头信息获取用户信息的配置类
 *
 * @author lemon
 * @date 2019-08-13 17:27:06 创建
 */
@Configuration
public class HttpSessionIdResolverConfig {

    @Bean
    public HeaderHttpSessionIdResolver httpSessionStrategy() {
        return new HeaderHttpSessionIdResolver("SESSION");
    }
}
