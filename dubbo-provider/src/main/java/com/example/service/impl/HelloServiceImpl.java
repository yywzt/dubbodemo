package com.example.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.HelloService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author ywyw2424@foxmail.com
 * @date 2018/9/17 13:44
 * @desc
 */
@Service(loadbalance = "roundrobin")
public class HelloServiceImpl implements HelloService {

    @Value("${dubbo.protocol.port}")
    private String port;

    @Override
    public String SayHello(String name) {
        return "Hello : " + name + "From : " + port;
    }
}
