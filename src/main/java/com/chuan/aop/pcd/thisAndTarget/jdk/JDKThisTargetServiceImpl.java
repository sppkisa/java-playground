package com.chuan.aop.pcd.thisAndTarget.jdk;

import org.springframework.stereotype.Service;

/**
 * @author xucy-e
 */
@Service
public class JDKThisTargetServiceImpl implements JDKThisTargetService {
    @Override
    public void test1() {
        System.out.printf("目标方法 %s 的方法体执行了\n", this.getClass().getSimpleName() + "#test1");
    }

    @Override
    public void test2() {
        System.out.printf("目标方法 %s 的方法体执行了\n", this.getClass().getSimpleName() + "#test2");
    }
}
