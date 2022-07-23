package com.chuan.aop.parameter.binding;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 核心原则：切点表达式限制联结点的匹配。argNames及增强方法中的形参列表，只是在方法匹配之后用来决定如何接收联结点方法的参数。
 *
 * @author xucy-e
 */
@Aspect
@Component
public class ParameterBindingAspect {

    // IDE 会有 `argNames attribute isn't defined` 的警告
    @Before(value = "execution(void ParameterBindingService.test(..)) && args(arg1, arg2)")
    public void beforeAdvice(String arg1, int arg2) {
        System.out.printf("-------------前置增强：name=%s, age=%d-------------%n", arg1, arg2);
    }

    @AfterReturning(value = "execution(void ParameterBindingService.test(..)) && args(name, age)", argNames = "name,age")
    public void afterAdvice(String name, int age) {
        System.out.printf("-------------返回后增强：name=%s, age=%d-------------%n", name, age);
    }

    @After(value = "execution(void ParameterBindingService.test(..)) && args(name, age)", argNames = "age,name")
    public void afterReturningAdvice(int age, String name) {
        System.out.printf("-------------后置增强：name=%s, age=%d-------------%n", name, age);
    }

    @Around(value = "execution(void ParameterBindingService.test(..)) && args(name, age)")
    public void aroundAfterAdvice(ProceedingJoinPoint pjp, int age, String name) throws Throwable {
        pjp.proceed();
        System.out.printf("-------------环绕后增强：name=%s, age=%d-------------%n", name, age);
    }
}
