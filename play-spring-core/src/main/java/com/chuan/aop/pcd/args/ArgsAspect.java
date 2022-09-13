package com.chuan.aop.pcd.args;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author xucy-e
 */
@Aspect
@Component
public class ArgsAspect {
    @After("args(Number, Number)")
    public void afterAdvice1() {
        System.out.println("-------------后置增强：args-------------");
    }

    @After("execution(* *(Number, Number))")
    public void afterAdvice2() {
        System.out.println("-------------后置增强：execution-------------");
    }
}
