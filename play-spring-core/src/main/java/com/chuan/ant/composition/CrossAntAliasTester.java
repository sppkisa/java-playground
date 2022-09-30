package com.chuan.ant.composition;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author xucy-e
 */
@BaseAnt(17)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CrossAntAliasTester {

    @AliasFor(value = "home", annotation = BaseAnt.class)
    String address();
}
