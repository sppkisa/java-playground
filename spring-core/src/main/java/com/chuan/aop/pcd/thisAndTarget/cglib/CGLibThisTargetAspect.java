package com.chuan.aop.pcd.thisAndTarget.cglib;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author xucy-e
 */
@Aspect
@Component
public class CGLibThisTargetAspect {

    @After("this(com.chuan.aop.pcd.thisAndTarget.cglib.CGLibThisTargetServiceImpl)")
    public void afterAdvice1() {
        System.out.println("-------------后置增强：this-------------");
    }

    @After("target(com.chuan.aop.pcd.thisAndTarget.cglib.CGLibThisTargetServiceImpl)")
    public void afterAdvice2() {
        System.out.println("-------------后置增强：target-------------");
    }

}
