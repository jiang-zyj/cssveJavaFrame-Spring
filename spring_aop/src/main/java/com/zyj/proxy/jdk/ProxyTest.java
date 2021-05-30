package com.zyj.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName CglibTest
 * @author: YaJun
 * @Date: 2021 - 05 - 30 - 10:52
 * @Package: com.cssve.proxy.jdk
 * @Description:
 */
public class ProxyTest {

    public static void main(String[] args) {

        // 实例化目标对象
        Target target = new Target();

        // 创建增强对象
        Advice advice = new Advice();

        // 基于 jdk 的动态代理实现通过的是反射包下的类 Proxy 实现
        TargetInterface targetInterface = (TargetInterface) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    // 在反射中进行方法执行的核心方法
                    // 第一个 proxy 是目标对象生成的代理对象
                    // 第二个参数为 执行的方法
                    // 第三个参数表示执行方法的参数
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        // 方法的增强
                        advice.before();
                        // 执行目标对象的方法
                        Object invoke = method.invoke(target, args);
                        // 方法的增强
                        advice.after();
                        return invoke;
                    }
                }
        );

        targetInterface.save();
    }

}
