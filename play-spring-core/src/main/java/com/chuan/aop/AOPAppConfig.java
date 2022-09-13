package com.chuan.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author xucy-e
 */
// @EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableAspectJAutoProxy
@ComponentScan
@Configuration
public class AOPAppConfig {
}
