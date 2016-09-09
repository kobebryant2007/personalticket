package com.airchina.controller;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class SpringBootTestController {

    @RequestMapping("/web")
    @ResponseBody
    String home() {
        return "Hello  every World!";
    }

    @RequestMapping("/next/{id}")
    @ResponseBody
    String next(@PathVariable("id") Long id){
        System.out.println(id);
        return "进行下一步";
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootTestController.class, args);
    }
}
