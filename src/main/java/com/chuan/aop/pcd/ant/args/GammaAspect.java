package com.chuan.aop.pcd.ant.args;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author xucy-e
 */
@Aspect
@Component
public class GammaAspect {

    @After("@args(com.chuan.aop.pcd.ant.args.Gamma, *)")
    public void afterAdvice() {
        System.out.println("-------------后置增强：@args(Gamma, *)-------------");
    }
}
