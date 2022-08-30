package com.chuan.aop.proxy.jdk;

/**
 * @author xucy-e
 */
public class GunDog implements IDog {

    @Override
    public void info() {
        System.out.println("我是一只猎狗。");
        this.speed();
    }

    @Override
    public void speed() {
        System.out.println("我时速100公里。");
    }
}
