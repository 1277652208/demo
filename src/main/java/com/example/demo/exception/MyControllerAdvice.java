package com.example.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName：MyControllerAdvice
 * Package:com.example.demo.exception
 * Description:
 *
 * @Date:2019/2/16 22:37
 * @Author:13975567160@163.com
 */
@ControllerAdvice
public class MyControllerAdvice {
    @ResponseBody
    @ExceptionHandler(value = java.lang.Exception.class)
    public Map<String, Object> myException(Exception e){
        Map<String, Object> map = new HashMap<>();
        map.put("code",500);
        map.put("msg","出错了");
        return map;
    }

}