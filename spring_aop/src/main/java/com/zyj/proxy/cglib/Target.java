package com.zyj.proxy.cglib;


/**
 * @program: CssveJavaFrame-Spring
 * @ClassName Target
 * @author: YaJun
 * @Date: 2021 - 05 - 30 - 10:50
 * @Package: com.cssve.proxy.jdk
 * @Description:
 */
public class Target{

    public void save() {
        System.out.println("执行数据保存操作...");
    }

    public void delete() {
        System.out.println("执行删除操作...");
    }

}
