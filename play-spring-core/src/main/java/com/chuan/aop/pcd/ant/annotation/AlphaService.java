package com.chuan.aop.pcd.ant.annotation;

import com.chuan.aop.pcd.ant.withinAndTarget.Beta;
import org.springframework.stereotype.Service;

/**
 * @author xucy-e
 */
@Beta
@Service
public class AlphaService {
    @Alpha
    public void test() {
        System.out.printf("目标方法 %s 的方法体执行了\n", this.getClass().getSimpleName() + "#test");
    }
}
