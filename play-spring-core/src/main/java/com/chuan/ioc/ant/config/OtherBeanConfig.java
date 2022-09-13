package com.chuan.ioc.ant.config;

import com.chuan.ioc.ant.bean.otherbean.BeanX;
import com.chuan.ioc.ant.bean.otherbean.BeanXX;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xucy-e
 */
@Configuration
public class OtherBeanConfig {

    @Bean
    public BeanX beanX() {
        return new BeanX("ZhangSan");
    }

    @Bean
    public BeanXX beanXX() {
        return new BeanXX(this.beanX(), this.beanX());
    }
}
