package com.example.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.api.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author ywyw2424@foxmail.com
 * @date 2018/9/17 14:40
 * @desc
 */
@Service("testHelloService")
public class TestHelloService{

    @Reference(version = "1.0.0")
    HelloService helloService;

    public void test(String name){
        helloService.SayHello(name);
    }
}
