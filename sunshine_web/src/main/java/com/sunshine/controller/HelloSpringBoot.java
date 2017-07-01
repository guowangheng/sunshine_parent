package com.sunshine.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Guo.WangHeng on 2017/6/30.
 */
@RestController
public class HelloSpringBoot {

    @RequestMapping(value = "/")
    public String hello(){
        return "Hello Spring Boot";
    }

}
