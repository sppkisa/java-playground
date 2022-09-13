package com.chuan.aop.introduction;

/**
 * @author xucy-e
 */
public class DefaultMixinServiceImpl implements MixinService{
    @Override
    public void mixinMethod1() {
        System.out.printf("混入方法 %s#%s 执行了%n", this.getClass().getSimpleName(), "mixinMethod1");
    }

    @Override
    public void mixinMethod2() {
        System.out.printf("混入方法 %s#%s 执行了%n", this.getClass().getSimpleName(), "mixinMethod2");
    }
}
