package com.zyj.PersonMapTest;

import com.zyj.bean.PersonMap;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName PersonMapTest
 * @author: YaJun
 * @Date: 2021 - 05 - 28 - 13:41
 * @Description: com.zyj.PersonMapTest
 * @version: 1.0
 */
public class PersonMapTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonMap personMap = context.getBean("personMap", PersonMap.class);
        System.out.println(personMap);
    }

}
