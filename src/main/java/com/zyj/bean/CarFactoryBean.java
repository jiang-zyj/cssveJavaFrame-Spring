package com.zyj.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName CarFactoryBean
 * @author: YaJun
 * @Date: 2021 - 05 - 28 - 14:16
 * @Description: com.zyj.bean
 * @version: 1.0
 */
public class CarFactoryBean implements FactoryBean<Car> {

    /**
     * 工厂 bean 具体创建的 bean 对象是由 getObject 方法来返回的
     * @return
     * @throws Exception
     */
    @Override
    public Car getObject() throws Exception {
        return new Car(001, "五菱", 1000.0);
    }

    /**
     * 返回具体的 bean 对象的类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    /**
     * bean 可以是单例的，也可以是原型的
     * @return
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
