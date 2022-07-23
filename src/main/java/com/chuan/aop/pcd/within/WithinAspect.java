package com.chuan.aop.pcd.within;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author xucy-e
 */
@Aspect
@Component
public class WithinAspect {
    @After("within(com.chuan.aop.pcd.within..*)")
    public void afterAdvice() {
        System.out.println("-------------后置增强：within-------------");
    }
}
