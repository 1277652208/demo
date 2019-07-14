package com.example.demo.controller;

import com.example.demo.config.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
/*    @Value("${boot.name}")
    private String name;*/
    @Autowired
    private ConfigInfo configInfo;

    @RequestMapping("/hello")
    public @ResponseBody String config(){
        return configInfo.getName();
    }
}