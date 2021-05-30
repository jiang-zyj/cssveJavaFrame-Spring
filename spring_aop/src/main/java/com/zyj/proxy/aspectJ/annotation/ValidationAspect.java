package com.zyj.proxy.aspectJ.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName ValidationAspect
 * @author: YaJun
 * @Date: 2021 - 05 - 30 - 19:12
 * @Package: com.zyj.proxy.aspectJ.annotation
 * @Description:
 */
@Component
@Aspect
@Order(2)
public class ValidationAspect {

    @Before(value = "com.zyj.proxy.aspectJ.annotation.LoggingAspect.declaredPointcut()")
    public void beforeMethod(JoinPoint joinPoint) {
        Signature methodName = joinPoint.getSignature();
        System.out.println("ValidationAspect ==> The Method " + methodName);
    }

}
