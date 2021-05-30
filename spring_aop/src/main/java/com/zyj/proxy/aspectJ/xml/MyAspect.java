package com.zyj.proxy.aspectJ.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName MyAspect
 * @author: YaJun
 * @Date: 2021 - 05 - 30 - 14:21
 * @Package: com.cssve.proxy.aspectJ.xml
 * @Description:
 */
public class MyAspect {

    public void beforeLog(JoinPoint joinPoint) {
        // 通过连接点对象获取方法的参数
        Object[] args = joinPoint.getArgs();
        // 通过连接点对象获取方法名
        Signature methodName = joinPoint.getSignature();
        System.out.println("保存操作前做【日志记录】\n方法名：" + methodName + "\n方法参数：" + args.toString());
    }

    public void afterLog(JoinPoint joinPoint) {
        // 通过连接点对象获取方法名
        Signature methodName = joinPoint.getSignature();
        // 通过连接点对象获取方法参数
        Object[] args = joinPoint.getArgs();
        System.out.println("操作操作之后做【日志记录】\n 方法名：" + methodName + "\n方法参数：" + args.toString());
    }

    public void afterReturnMethod(JoinPoint joinPoint, Object result) {
        // 通过连接点对象获取方法名
        Signature methodName = joinPoint.getSignature();
        System.out.println("【returnMethod】方法名：" + methodName  + "\n返回值：" + result);
    }


    public void afterThrowingMethod(JoinPoint joinPoint, Throwable ex) {
//        int res = 12 / 0;
        // 获取方法名
        Signature methodName = joinPoint.getSignature();
        System.out.println("【ThrowingMethod】MethodName：" + methodName + "\ncause Exception:" + ex.toString());
    }

    public void around(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("The Method before Logging");
            joinPoint.proceed();
            System.out.println("The Method after Logging");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }



}
