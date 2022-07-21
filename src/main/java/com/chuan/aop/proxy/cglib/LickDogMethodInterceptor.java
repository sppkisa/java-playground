package com.chuan.aop.proxy.cglib;

import com.chuan.aop.proxy.Advice;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author xucy-e
 */
public class LickDogMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Advice advice = new Advice();
        advice.before();
        Object res = methodProxy.invokeSuper(o, objects);
        advice.afterReturning();
        return res;
    }
}
