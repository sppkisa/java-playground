package com.chuan.aop.introduction;

import com.chuan.util.MyPrinter;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * @author xucy-e
 */
@Aspect
@Component
public class IntroAspect {
    /**
     * @apiNote 此注解必须声明在切面类中；defaultImpl 对应的类不需要是Spring的Bean。
     */
    @DeclareParents(value = "com.chuan.aop.introduction.IntroService", defaultImpl = DefaultMixinServiceImpl.class)
    private MixinService mixin;

    @Before("execution(* com.chuan.aop.introduction.IntroService.test()) && this(mixinService)")
    public void beforeAdvice(MixinService mixinService) {
        MyPrinter.println("-------------前置增强-------------", String.format("this.mixin=%s", this.mixin), mixinService);
    }
}
