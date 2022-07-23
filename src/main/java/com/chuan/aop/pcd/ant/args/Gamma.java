package com.chuan.aop.pcd.ant.args;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author xucy-e
 */
@Target({ElementType.TYPE, ElementType.PARAMETER}) // TODO @Args的AOP为啥不是监听的形参被此注解修饰的方法
@Retention(RetentionPolicy.RUNTIME)
public @interface Gamma {
}
