package com.chuan.aop.parameter.binding;

import org.springframework.stereotype.Service;

/**
 * @author xucy-e
 */
@Service
public class ParameterBindingService {
    public void test(String name, int age) {
        System.out.printf("目标方法 %s 的方法体执行了\n", this.getClass().getSimpleName() + "#test");
    }
}
