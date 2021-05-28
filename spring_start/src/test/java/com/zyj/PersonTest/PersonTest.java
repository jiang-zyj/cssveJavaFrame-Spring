package com.zyj.PersonTest;

import com.zyj.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName PersonTest
 * @author: YaJun
 * @Date: 2021 - 05 - 28 - 13:27
 * @Description: com.zyj.PersonTest
 * @version: 1.0
 */
public class PersonTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }
    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("person1", Person.class);
        System.out.println(person);
    }

}
