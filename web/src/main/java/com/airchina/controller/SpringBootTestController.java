package com.airchina.controller;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

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
    Map next(@PathVariable("id") Long id){
        System.out.println(id);
        Map<String,Long> list = new LinkedHashMap<String, Long>();
        list.put("hello",id);
        list.put("sss", id + 1);
        return list;
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootTestController.class, args);
    }
}
