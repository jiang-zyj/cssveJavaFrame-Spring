package com.zyj.PersonListTest;

import com.zyj.bean.PersonList;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName PersonListTest
 * @author: YaJun
 * @Date: 2021 - 05 - 28 - 13:36
 * @Description: com.zyj.PersonListTest
 * @version: 1.0
 */
public class PersonListTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonList personList = context.getBean("personList", PersonList.class);
        System.out.println(personList);
    }

}
