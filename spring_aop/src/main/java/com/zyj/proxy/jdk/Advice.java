package com.zyj.proxy.jdk;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName MyAspect
 * @author: YaJun
 * @Date: 2021 - 05 - 30 - 10:51
 * @Package: com.cssve.proxy.jdk
 * @Description:
 */
public class Advice {

    public void before() {
        System.out.println("前置增强【记录执行方法之前的时间】");
    }

    public void after() {
        System.out.println("后置增强【记录执行方法之前的时间】");
    }



}
