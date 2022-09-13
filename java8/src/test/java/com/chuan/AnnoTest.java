package com.chuan;

import com.chuan.annotation.Gamma;
import org.springframework.core.annotation.AnnotatedElementUtils;

/**
 * @author xucy-e
 */
@Gamma(alpha = "alpha", beta = "beta")
public class AnnoTest {
    public static void main(String[] args) {
        boolean annotated = AnnotatedElementUtils.isAnnotated(AnnoTest.class, Gamma.class);
        // Beta beta = AnnotatedElementUtils.getMergedAnnotation(Test.class, Beta.class);
        // System.out.println(beta);
    }
}
