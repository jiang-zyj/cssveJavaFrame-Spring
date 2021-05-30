package com.zyj.proxy.aspectJ.annotation;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName LoggingAspect
 * @author: YaJun
 * @Date: 2021 - 05 - 30 - 16:28
 * @Package: com.zyj.proxy.aspectJ.annotation
 * @Description:
 */

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    @Pointcut("execution(* com.zyj.proxy.aspectJ.annotation.*.*(..))")
    public void declaredPointcut() {}
    /**
     * 前置通知：在目标方法（连接点）执行之前执行
     */
    @Before("execution(* com.zyj.proxy.aspectJ.annotation.*.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        // 通过连接点对象获取方法的名字
        Signature methodName = joinPoint.getSignature();
        // 获取连接点对象获取方法的参数
        Object[] args = joinPoint.getArgs();
        System.out.println("LoggingAspect before ==> The Method " + methodName + "\t The Arguments " + args.toString());
    }

    /**
     * 后置通知：在目标方法（连接点）执行之后执行
     */
    @After("declaredPointcut()")
    public void afterMethod(JoinPoint joinPoint) {
        // 通过连接点对象获取方法的名字
        Signature methodName = joinPoint.getSignature();
        // 通过连接点对象获取方法的参数
        Object[] args = joinPoint.getArgs();
        System.out.println("LoggingAspect after ==> The Method " + methodName + "\t The Arguments " + args.toString());
    }

    /**
     * 返回通知：在目标方法正常执行结束后执行，可以获取方法返回值
     * 获取方法的返回值：通过 returning 来指定一个名字，必须要与方法中的一个形参名一致
     * 该通知不管方法如何执行，最终必会执行返回值
     * @param joinPoint 连接点对象
     * @param result    返回结果
     */
    @AfterReturning(value = "declaredPointcut()",returning = "result")
    public void afterMethodReturning(JoinPoint joinPoint, Object result) {
        // 通过连接点对象获取方法名
        Signature methodName = joinPoint.getSignature();
        System.out.println("LoggingAspect afterReturning ==> The Method " + methodName + "\t Result: " + result);
    }

    /**
     * 异常通知：在目标方法抛出异常后执行
     * 获取方法的异常：通过 throwing 来指定一个名字，必须要与方法中的一个形参名一致
     * 可以通过形参中异常的类型来设置抛出指定异常才会执行异常通知
     * @param joinPoint 连接点对象
     * @param ex        异常对象
     */
    @AfterThrowing(value = "declaredPointcut()", throwing = "ex")
    public void afterMethodThrowing(JoinPoint joinPoint, ArithmeticException ex) {
        // 通过连接点对象获取方法名
        Signature methodName = joinPoint.getSignature();
        System.out.println("LoggingAspect afterThrowing ==> The Method " + methodName + "\t throwing: " + ex);
    }

    /**
     * 环绕通知：环绕这目标方法执行，可以理解是 前置、后置、返回、异常的结合体
     * 更像是动态代理的整个过程
     * @param joinPoint 连接点对象
     * @return          返回值
     */
    @Around(value = "declaredPointcut()")
    public Object around(ProceedingJoinPoint joinPoint) {
        try {
            // 前置通知
            System.out.println("before device");
            Object result = joinPoint.proceed();
            // 返回
            return result;
        } catch (Throwable throwable) {
            // 异常通知
            throwable.printStackTrace();
        } finally {
            // 后置
            System.out.println("after device");
        }
        return null;
    }

}
