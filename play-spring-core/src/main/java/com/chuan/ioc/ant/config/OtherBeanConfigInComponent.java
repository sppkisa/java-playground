package com.chuan.ioc.ant.config;

import com.chuan.ioc.ant.bean.otherbean.BeanY;
import com.chuan.ioc.ant.bean.otherbean.BeanYY;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author xucy-e
 */
@Component
public class OtherBeanConfigInComponent {

    @Bean
    private BeanY beanY() {
        return new BeanY("ZhangSan");
    }

    @Bean
    private BeanYY beanYY() {
        return new BeanYY(this.beanY(), this.beanY());
    }
}
