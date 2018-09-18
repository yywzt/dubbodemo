package com.example.controller;

import com.example.service.TestHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ywyw2424@foxmail.com
 * @date 2018/9/17 16:28
 * @desc
 */
@RestController
public class HelloController {

    @Autowired
    TestHelloService testHelloService;

    @RequestMapping("/test")
    public String test(){
        String test = testHelloService.test("123");
        System.out.println(test);
        return test;
    }
}
