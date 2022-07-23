package com.chuan.aop.pcd.ant.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author xucy-e
 */
@Aspect
@Component
public class AlphaAspect {
    @After("@annotation(com.chuan.aop.pcd.ant.annotation.Alpha)")
    public void afterAdvice() {
        System.out.println("-------------后置增强：@annotation(Alpha)-------------");
    }
}
