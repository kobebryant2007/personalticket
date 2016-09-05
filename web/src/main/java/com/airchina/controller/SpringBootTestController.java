package com.airchina.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by n on 2016/9/1.
 */

@RestController
@EnableConfigurationProperties
public class SpringBootTestController {
    @RequestMapping("/")
    String home(){
        return "hello world";
    }
    public static void main(String[] args){
        SpringApplication.run(SpringBootTestController.class, args);
    }
}
