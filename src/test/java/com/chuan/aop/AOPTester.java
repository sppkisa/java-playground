package com.chuan.aop;

import com.chuan.aop.order.service.IBuy;
import com.chuan.aop.order.service.impl.Buyer;
import com.chuan.aop.pcd.ant.annotation.AlphaService;
import com.chuan.aop.pcd.ant.args.GammaService;
import com.chuan.aop.pcd.ant.withinAndTarget.BetaServiceA;
import com.chuan.aop.pcd.ant.withinAndTarget.BetaServiceB;
import com.chuan.aop.pcd.args.ArgsService;
import com.chuan.aop.pcd.bean.BeanPCDServiceA;
import com.chuan.aop.pcd.bean.BeanPCDServiceB;
import com.chuan.aop.pcd.thisAndTarget.cglib.CGLibThisTargetServiceImpl;
import com.chuan.aop.pcd.thisAndTarget.jdk.JDKThisTargetService;
import com.chuan.aop.pcd.within.WithinService;
import com.chuan.aop.proxy.Advice;
import com.chuan.aop.proxy.cglib.LickDog;
import com.chuan.aop.proxy.cglib.LickDogMethodInterceptor;
import com.chuan.aop.proxy.jdk.GunDog;
import com.chuan.aop.proxy.jdk.IDog;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Proxy;
import java.util.List;

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
    @Autowired
    private JDKThisTargetService jdkThisTargetService;
    @Autowired
    private CGLibThisTargetServiceImpl cgLibThisTargetService;
    @Autowired
    private List<WithinService> withinServices;

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

    // TODO WTF 怎么能嵌套AOP了？？？
    @Test
    public void testCGLibDynamicProxy() {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "C:\\Users\\chuan\\Desktop");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(LickDog.class);
        enhancer.setCallback(new LickDogMethodInterceptor());
        LickDog proxyLickDog = (LickDog) enhancer.create();
        LickDog targetLickDog = new LickDog();
        System.out.println("----------------------目标对象的info方法调用结果----------------------");
        targetLickDog.info(true);
        System.out.println("----------------------代理对象的info方法调用结果----------------------");
        proxyLickDog.info(true);
        System.out.println("----------------------单独调用代理对象的speed方法----------------------");
        proxyLickDog.speed();
    }

    @Test
    public void testAspectOrder() {
        buyer.buy();
    }

    @Test
    public void testPCD_JDK_ThisAndTarget() {
        jdkThisTargetService.test1();
        jdkThisTargetService.test2();
    }

    @Test
    public void testPCD_CGLIB_ThisAndTarget() {
        cgLibThisTargetService.test();
    }

    @Test
    public void testPCD_within() {
        for (WithinService withinService : withinServices) {
            withinService.test1();
            withinService.test2();
            System.out.println();
        }
    }

    @Test
    public void testPCD_args() {
        ArgsService argsService = applicationContext.getBean(ArgsService.class);
        argsService.test1(1, 1);
        argsService.test2(2, 2);
    }

    @Test
    public void testPCD_bean() {
        BeanPCDServiceA beanPCDServiceA = applicationContext.getBean(BeanPCDServiceA.class);
        BeanPCDServiceB beanPCDServiceB = applicationContext.getBean(BeanPCDServiceB.class);
        beanPCDServiceA.test();
        beanPCDServiceB.test();
    }

    @Test
    public void testPCD_AtAnnotation() {
        AlphaService alphaService = applicationContext.getBean(AlphaService.class);
        alphaService.test();
    }

    @Test
    public void testPCD_AtWithinAndTarget() {
        BetaServiceA betaServiceA = (BetaServiceA) applicationContext.getBean("betaServiceA");
        betaServiceA.test1();
        betaServiceA.test2();

        System.out.println();

        BetaServiceB betaServiceB = (BetaServiceB) applicationContext.getBean("betaServiceB");
        betaServiceB.test1();
        betaServiceB.test2();
    }

    @Test
    public void testPCD_AtArgs() {
        GammaService gammaService = applicationContext.getBean(GammaService.class);
        gammaService.test(new GammaService.InnerGamma(), true);
    }
}
