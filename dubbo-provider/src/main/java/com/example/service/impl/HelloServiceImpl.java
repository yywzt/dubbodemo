package com.example.service.impl;

import com.example.api.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author ywyw2424@foxmail.com
 * @date 2018/9/17 13:44
 * @desc
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String SayHello(String name) {
        return "Hello : " + name;
    }
}
