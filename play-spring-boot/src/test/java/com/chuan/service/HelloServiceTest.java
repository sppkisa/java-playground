package com.chuan.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author xucy-e
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloServiceTest {
    @Autowired
    private HelloService helloService;

    @Test
    public void testSayHello() {
        helloService.sayHello();
    }
}
