package com.chuan.aop.pcd.bean;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author xucy-e
 */
@Aspect
@Component
public class BeanPCDAspect {
    @After("bean(beanPCDServiceA)")
    public void afterAdvice1() {
        System.out.println("-------------后置增强：bean(beanPCDServiceA)-------------");
    }

    @After("bean(beanPCDService*)")
    public void afterAdvice2() {
        System.out.println("-------------后置增强：bean(beanService*)-------------");
    }
}
