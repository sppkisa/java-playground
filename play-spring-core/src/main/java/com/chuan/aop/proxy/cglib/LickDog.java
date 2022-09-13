package com.chuan.aop.proxy.cglib;

/**
 * @author xucy-e
 */
public class LickDog {
    public void info(boolean tellSpeed) {
        System.out.println("我是一只舔狗。");
        if (tellSpeed) {
            this.speed();
        }
    }

    public void speed() {
        System.out.println("我时速250公里。");
    }
}
