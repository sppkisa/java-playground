package com.chuan.aop.order.service.impl;

import com.chuan.aop.order.service.IBuy;
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
}
