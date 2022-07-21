package com.chuan.aop;

import com.chuan.aop.proxy.Advice;
import com.chuan.aop.proxy.GunDog;
import com.chuan.aop.proxy.IDog;
import com.chuan.aop.service.IBuy;
import com.chuan.aop.service.impl.Buyer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Proxy;

/**
 * @author xucy-e
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AOPAppConfig.class})
public class AOPTester {
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private IBuy buyer;

    @Test
    public void testBeanProxy() {
        Buyer buyer = applicationContext.getBean(Buyer.class);
        System.out.println(buyer.getClass().getSimpleName());
    }

    @Test
    public void testJDKDynamicProxy() {
        final GunDog gunDog = new GunDog(); //目标对象
        Advice advice = new Advice(); // 增强对象
        // 调用代理对象的任何方法，实质执行的都是invoke方法
        IDog proxy = (IDog) Proxy.newProxyInstance(
                gunDog.getClass().getClassLoader(), // 目标对象的类加载器
                gunDog.getClass().getInterfaces(), // 目标对象相同的接口字节码对象数组
                (proxy1, method, args) -> { // InvocationHandler
                    advice.before();
                    Object res = method.invoke(gunDog, args); // 注意触发方法时传入的主调是目标对象`gunDog`
                    advice.afterReturning();
                    return res;
                }
        );
        System.out.println("----------------------目标对象的info方法调用结果----------------------");
        gunDog.info();
        System.out.println("----------------------代理对象的info方法调用结果----------------------");
        proxy.info();
        System.out.println("----------------------单独调用代理对象的speed方法----------------------");
        proxy.speed();
    }

    @Test
    public void testAspectOrder() {
        buyer.buy();
    }

    @Test
    public void testPCD() {
        buyer.pay();
    }
}
