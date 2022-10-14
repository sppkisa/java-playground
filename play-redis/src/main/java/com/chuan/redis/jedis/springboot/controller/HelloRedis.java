package com.chuan.redis.jedis.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * @author xucy-e
 */
@RestController
@RequestMapping(("/redis"))
public class HelloRedis {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @GetMapping("/hello")
    public String sayHello() {
        redisTemplate.opsForValue().set("redis-springboot", "hello, springboot");
        return redisTemplate.opsForValue().get("redis-springboot");
    }

    @GetMapping("/keys")
    public Set<String> getAllKeys() {
        return redisTemplate.keys("*");
    }
}
