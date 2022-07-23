package com.chuan.aop.pcd.args;

import org.springframework.stereotype.Service;

/**
 * @author xucy-e
 */
@Service
public class ArgsService {

    public void test1(Number number1, Number number2) {
        System.out.printf("目标方法 %s 的方法体执行了\n", this.getClass().getSimpleName() + "#test1");
    }

    public void test2(Integer integer1, Integer integer2) {
        System.out.printf("目标方法 %s 的方法体执行了\n", this.getClass().getSimpleName() + "#test2");
    }
}
