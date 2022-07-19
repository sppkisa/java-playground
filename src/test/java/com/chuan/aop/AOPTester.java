package com.chuan.aop;

import com.chuan.aop.service.IBuy;
import com.chuan.aop.service.impl.Buyer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
    public void testAspectOrder() {
        buyer.buy();
    }

    @Test
    public void testPCD() {
        buyer.pay();
    }
}
