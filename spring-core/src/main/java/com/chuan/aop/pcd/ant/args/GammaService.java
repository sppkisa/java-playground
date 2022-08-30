package com.chuan.aop.pcd.ant.args;

import org.springframework.stereotype.Service;

/**
 * @author xucy-e
 */
@Service
public class GammaService {

    @Gamma
    public static class InnerGammaA {

    }

    public static class InnerGammaB extends InnerGammaA {

    }

    public void test1(InnerGammaA innerGammaA, boolean flag) {
        System.out.printf("目标方法 %s 的方法体执行了\n", this.getClass().getSimpleName() + "#test1");
    }

    public void test2(InnerGammaB innerGammaB, boolean flag) {
        System.out.printf("目标方法 %s 的方法体执行了\n", this.getClass().getSimpleName() + "#test2");
    }

}
