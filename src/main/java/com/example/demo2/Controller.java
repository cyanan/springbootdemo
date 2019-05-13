package com.example.demo2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by yongsheng on 2019/4/16
 */
@RestController
public class Controller {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger(Controller.class);
        logger.info("hello world");
    }
}
