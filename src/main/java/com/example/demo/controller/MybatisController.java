package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Controller
public class MybatisController {
    @Autowired
    UserService userService;
    @GetMapping("/find")
    public String find(Model model){
        User user = userService.find(1);
        model.addAttribute("user",user);
        return "find";
    }
    @GetMapping("/update")
    public @ResponseBody
    String update(){
        ExecutorService executorService = Executors.newFixedThreadPool(25);

        for (int i = 0; i < 10000; i++) {
            executorService.submit(()->{
                int count = userService.update("1");
                System.out.println(count);
            });
        }

        return "11";
    }
    @RequestMapping("/user/{id}/{name}")
    public @ResponseBody
    String user(@PathVariable String id, @PathVariable String name){
        int count = userService.update(id);
        System.out.println(count);
        return name;
    }
}
