package com.chuan.play.mybatis.plus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.chuan.play.mybatis.plus.dao")
@SpringBootApplication
public class PlayMybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlayMybatisPlusApplication.class, args);
    }

}
