package com.example.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.HelloService;

/**
 * @author ywyw2424@foxmail.com
 * @date 2018/9/17 13:44
 * @desc
 */
//@Service(
//        version = "${demo.service.version}",
//        application = "${dubbo.application.id}",
//        protocol = "${dubbo.protocol.id}",
//        registry = "${dubbo.registry.id}"
//)
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String SayHello(String name) {
        throw new RuntimeException("hahahah");
//        return "Hello : " + name;
    }
}
