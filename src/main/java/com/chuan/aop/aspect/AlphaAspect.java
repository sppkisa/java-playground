package com.chuan.aop.aspect;

import com.chuan.aop.ant.Alpha;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author xucy-e
 */
@Aspect
@Component
public class AlphaAspect {
    @Around("@annotation(alpha)")
    public Object test(ProceedingJoinPoint pjp, Alpha alpha) throws Throwable {
        System.out.println("前置增强");
        Object res = pjp.proceed();
        System.out.println("后置后强");
        return res;
    }
}
