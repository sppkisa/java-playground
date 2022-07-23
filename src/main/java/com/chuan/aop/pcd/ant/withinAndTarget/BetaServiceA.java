package com.chuan.aop.pcd.ant.withinAndTarget;

import org.springframework.stereotype.Service;

/**
 * @author xucy-e
 */
@Beta
@Service
public class BetaServiceA {
    public void test1() {
        System.out.printf("目标方法 %s 的方法体执行了\n", this.getClass().getSimpleName() + "#test1");
    }

    public void test2() {
        System.out.printf("目标方法 %s 的方法体执行了\n", this.getClass().getSimpleName() + "#test2");
    }
}
