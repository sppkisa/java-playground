package com.chuan.aop.pcd.ant.withinAndTarget;

import org.springframework.stereotype.Service;

/**
 * @author xucy-e
 */
@Service
public class BetaServiceB extends BetaServiceA {
    /**
     * TODO 与AOP无关的、额外的关于Java类继承的机制问题：方法覆盖是怎样一回事？——覆盖父类方法后，为什么不走 @Beta 的 @within 切面了？
     */
    @Override
    public void test1() {
        super.test1();
    }
}
