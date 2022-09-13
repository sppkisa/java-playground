package com.chuan.ioc.ant;

import com.chuan.ioc.ant.bean.value.UserProperty;
import org.springframework.context.annotation.*;
import org.springframework.core.convert.ConversionService;
import org.springframework.format.support.DefaultFormattingConversionService;

/**
 * @author xucy-e
 */
@PropertySource(value = "classpath:prop.properties", encoding="UTF-8")
@ComponentScan
@Configuration
public class IoCAppConfig {

    @Bean
    public ConversionService conversionService() {
        DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();
        conversionService.addConverter(String.class, UserProperty.Single.class, str -> {
            boolean equals = "是".equals(str);
            return new UserProperty.Single(equals);
        });
        return conversionService;
    }
}
