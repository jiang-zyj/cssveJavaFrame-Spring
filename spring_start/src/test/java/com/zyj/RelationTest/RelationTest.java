package com.zyj.RelationTest;

import com.zyj.bean.Address;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName RelationTest
 * @author: YaJun
 * @Date: 2021 - 05 - 28 - 15:36
 * @Package: com.zyj.RelationTest
 * @Description:
 */
public class RelationTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Address address3 = context.getBean("address3", Address.class);
        System.out.println(address3);
    }

}
