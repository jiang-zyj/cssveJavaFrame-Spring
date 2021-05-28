package com.zyj.CarTest;

import com.zyj.bean.Car;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName CarTest
 * @Auther: YaJun
 * @Date: 2021 - 05 - 27 - 16:00
 * @Description: com.zyj.CarTest
 * @version: 1.0
 */
public class CarTest {

    @Test
    public void Test0() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = context.getBean("car", Car.class);
        System.out.println(car);
    }

    @Test
    public void Test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = context.getBean("car1", Car.class);
        System.out.println(car);
    }
    @Test
    public void Test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = context.getBean("car2", Car.class);
        System.out.println(car);
    }
    @Test
    public void Test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = context.getBean("car3", Car.class);
        System.out.println(car);
    }

    @Test
    public void Test4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = context.getBean("car4", Car.class);
        System.out.println(car);
    }




}
