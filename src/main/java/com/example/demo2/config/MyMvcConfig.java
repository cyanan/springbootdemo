package com.example.demo2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * create by yongsheng on 2019/4/26
 */
//禁用SpringBoot对SpringMVC做的所有自动配置
@EnableWebMvc
//使用WebMvcConfigurer可以来扩展SpringMVC的功能
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //浏览器发送/hello请求，也来到login.html界面
        registry.addViewController("/hello").setViewName("login");
    }
}
