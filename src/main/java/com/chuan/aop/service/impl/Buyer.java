package com.chuan.aop.service.impl;

import com.chuan.aop.ant.Alpha;
import com.chuan.aop.service.IBuy;
import org.springframework.stereotype.Service;

/**
 * @author xucy-e
 */
@Service
public class Buyer implements IBuy {
    @Override
    public void buy() {
        System.out.printf("目标方法 %s 的方法体执行了\n", this.getClass().getSimpleName() + "#buy");
    }

    @Alpha
    @Override
    public void pay() {
        System.out.printf("目标方法 %s 的方法体执行了\n", this.getClass().getSimpleName() + "#pay");
    }
}
