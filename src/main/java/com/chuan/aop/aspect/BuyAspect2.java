package com.chuan.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author xucy-e
 */
@Order(2)
@Aspect
@Component
public class BuyAspect2 {

    @Around("buyPoint()")
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("---2---around-before");
        Object response = pjp.proceed();
        System.out.println("---2---around-after");
        return response;
    }

    @Before("buyPoint()")
    public void preAdvice(JoinPoint joinPoint) {
        System.out.println("---2---before");
    }

    @After("buyPoint()")
    public void afterAdvice() {
        System.out.println("---2---after");
    }

    @AfterReturning("buyPoint()")
    public void afterReturningAdvice() {
        System.out.println("---2---afterReturning");
    }

    @AfterThrowing("buyPoint()")
    public void afterThrowing() {
        System.out.println("---2---afterThrowing");
    }

    @Pointcut("execution(* com.chuan.aop.service.impl.Buyer.buy(..))")
    public void buyPoint() {

    }
}
