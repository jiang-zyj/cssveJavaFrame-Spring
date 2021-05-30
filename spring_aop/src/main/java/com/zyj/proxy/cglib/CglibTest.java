package com.zyj.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName CglibTest
 * @author: YaJun
 * @Date: 2021 - 05 - 30 - 13:19
 * @Package: com.cssve.proxy.aspectJ.ButtomImpl
 * @Description:
 */
public class CglibTest {

    public static void main(String[] args) {

        // 实例化目标对象
        Target target = new Target();

        // 实例化增强对象
        Advice advice = new Advice();

        // 创建一个增强器对象    【最终返回动态代理对象】
        Enhancer enhancer = new Enhancer();

        // 设置父类
        enhancer.setSuperclass(Target.class);

        // 设置回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

                // 增强方法
                advice.checkAuth();
                // 执行代理对象中的方法
                Object invoke = method.invoke(target, objects);

                // 增强方法
                advice.delete();
                return invoke;
            }
        });

        // 生成/创建代理对象
        Target t = (Target) enhancer.create();
//        System.out.println("代理对象：" + t);
        t.delete();

    }

}
