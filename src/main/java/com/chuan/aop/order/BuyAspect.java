package com.chuan.aop.order;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author xucy-e
 */
@Order(1)
@Aspect
@Component
public class BuyAspect {

    @Around("buyPoint()")
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around-before");
        Object response = pjp.proceed();
        System.out.println("around-after");
        return response;
    }

    @Before("buyPoint()")
    public void preAdvice(JoinPoint joinPoint) {
        System.out.println("before");
    }

    @After("buyPoint()")
    public void afterAdvice() {
        System.out.println("after");
    }

    @AfterReturning("buyPoint()")
    public void afterReturningAdvice() {
        System.out.println("afterReturning");
    }

    @AfterThrowing("buyPoint()")
    public void afterThrowing() {
        System.out.println("afterThrowing");
    }

    @Pointcut("execution(* com.chuan.aop.order.service.impl.Buyer.buy(..))")
    public void buyPoint() {

    }
}
