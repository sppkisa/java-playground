package com.chuan.aop.introduction;

import org.springframework.stereotype.Service;

/**
 * @author xucy-e
 */
@Service
public class IntroService {
    public void test() {
        System.out.printf("目标方法 %s 的方法体执行了\n", this.getClass().getSimpleName() + "#test");
    }
}
