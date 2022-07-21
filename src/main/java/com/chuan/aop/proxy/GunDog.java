package com.chuan.aop.proxy;

/**
 * @author xucy-e
 */
public class GunDog implements IDog {
    public void info() {
        System.out.println("我是一只猎狗。");
        this.speed();
    }

    @Override
    public void speed() {
        System.out.println("我时速100公里。");
    }
}
