package com.chuan.aop.pcd.thisAndTarget.jdk;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author xucy-e
 */
@Aspect
@Component
public class JDKThisTargetAspect {

    @After("this(com.chuan.aop.pcd.thisAndTarget.jdk.JDKThisTargetService)")
    public void afterAdvice1() {
        System.out.println("-------------后置增强：this JDKThisTargetService-------------");
    }

    @After("this(com.chuan.aop.pcd.thisAndTarget.jdk.JDKThisTargetServiceImpl)")
    public void afterAdvice2() {
        System.out.println("-------------后置增强：this JDKThisTargetServiceImpl-------------");
    }

    @After("target(com.chuan.aop.pcd.thisAndTarget.jdk.JDKThisTargetService)")
    public void afterAdvice3() {
        System.out.println("-------------后置增强：target JDKThisTargetService-------------");
    }

    @After("target(com.chuan.aop.pcd.thisAndTarget.jdk.JDKThisTargetServiceImpl)")
    public void afterAdvice4() {
        System.out.println("-------------后置增强：target JDKThisTargetServiceImpl-------------");
    }
}
