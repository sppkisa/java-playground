package com.chuan.ant.alias;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author xucy-e
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface InnerAntAliasTester {

    @AliasFor("description")
    String name() default "";

    @AliasFor("name")
    String description() default "x";
}
