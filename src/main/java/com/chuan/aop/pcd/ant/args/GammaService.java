package com.chuan.aop.pcd.ant.args;

import org.springframework.stereotype.Service;

/**
 * @author xucy-e
 */
@Service
public class GammaService {

    @Gamma
    public static final class InnerGamma {

    }

    public void test(InnerGamma innerGamma, boolean flag) {
        System.out.printf("目标方法 %s 的方法体执行了\n", this.getClass().getSimpleName() + "#test1");
    }

}
