package com.zyj.proxy.jdk;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName Target
 * @author: YaJun
 * @Date: 2021 - 05 - 30 - 10:50
 * @Package: com.cssve.proxy.jdk
 * @Description:
 */
public class Target implements TargetInterface{

    @Override
    public void save() {
        System.out.println("目标对象中的保存方法被执行了...");
    }

}
