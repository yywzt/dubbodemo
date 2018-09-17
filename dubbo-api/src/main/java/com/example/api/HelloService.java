package com.example.api;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author ywyw2424@foxmail.com
 * @date 2018/9/17 17:00
 * @desc
 */
@Service(version = "1.0.0",interfaceName = "HelloService")
public interface HelloService {

    String SayHello(String name);
}
