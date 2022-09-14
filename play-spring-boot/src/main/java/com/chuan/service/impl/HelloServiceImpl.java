package com.chuan.service.impl;

import com.chuan.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author xucy-e
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "Hello, world!";
    }
}
