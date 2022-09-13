package com.chuan.aop.pcd.ant.withinAndTarget;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author xucy-e
 */
@Aspect
@Component
public class BetaAspect {

    @After("@within(com.chuan.aop.pcd.ant.withinAndTarget.Beta)")
    public void afterAdvice2() {
        System.out.println("-------------后置增强：@within(Beta)-------------");
    }

    @After("@target(com.chuan.aop.pcd.ant.withinAndTarget.Beta)")
    public void afterAdvice1() {
        System.out.println("-------------后置增强：@target(Beta)-------------");
    }
}
