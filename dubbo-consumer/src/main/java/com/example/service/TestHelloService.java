package com.example.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.api.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

/**
 * @author ywyw2424@foxmail.com
 * @date 2018/9/17 14:40
 * @desc
 */
@Service("testHelloService")
public class TestHelloService{

    @Reference(loadbalance = "roundrobin")
    private HelloService helloService;

    @HystrixCommand(fallbackMethod = "fail")
    public String test(String name){
        return helloService.SayHello(name);
    }

    public String fail(String name){
        return "Hystrix Fallback Value!";
    }
}
