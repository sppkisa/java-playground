package chuan.aop;

import com.chuan.aop.AOPAppConfig;
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
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author xucy-e
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AOPAppConfig.class})
public class PCDTester {
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private JDKThisTargetService jdkThisTargetService;
    @Autowired
    private CGLibThisTargetServiceImpl cgLibThisTargetService;
    @Autowired
    private List<WithinService> withinServices;

    @Test
    public void test_JDK_this_target() {
        jdkThisTargetService.test1();
        jdkThisTargetService.test2();
    }

    @Test
    public void test_CGLib_this_target() {
        cgLibThisTargetService.test();
    }

    @Test
    public void test_within() {
        for (WithinService withinService : withinServices) {
            withinService.test1();
            withinService.test2();
            System.out.println();
        }
    }

    @Test
    public void test_args() {
        ArgsService argsService = applicationContext.getBean(ArgsService.class);
        argsService.test1(1, 1);
        argsService.test2(2, 2);
    }

    @Test
    public void test_bean() {
        BeanPCDServiceA beanPCDServiceA = applicationContext.getBean(BeanPCDServiceA.class);
        BeanPCDServiceB beanPCDServiceB = applicationContext.getBean(BeanPCDServiceB.class);
        beanPCDServiceA.test();
        beanPCDServiceB.test();
    }

    @Test
    public void testAnt_annotation() {
        AlphaService alphaService = applicationContext.getBean(AlphaService.class);
        alphaService.test();
    }

    @Test
    public void testAnt_within_Target() {
        BetaServiceA betaServiceA = (BetaServiceA) applicationContext.getBean("betaServiceA");
        betaServiceA.test1();
        betaServiceA.test2();

        System.out.println();

        BetaServiceB betaServiceB = (BetaServiceB) applicationContext.getBean("betaServiceB");
        betaServiceB.test1();
        betaServiceB.test2();
    }

    @Test
    public void testAnt_Args() {
        GammaService gammaService = applicationContext.getBean(GammaService.class);
        gammaService.test1(new GammaService.InnerGammaA(), true);
        gammaService.test2(new GammaService.InnerGammaB(), true);
    }
}
