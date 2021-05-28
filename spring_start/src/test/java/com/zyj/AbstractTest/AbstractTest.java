package com.zyj.AbstractTest;

import com.zyj.bean.Address;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName AbstractTest
 * @author: YaJun
 * @Date: 2021 - 05 - 28 - 15:32
 * @Package: com.zyj
 * @Description:
 */
public class AbstractTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Address address = context.getBean("address2", Address.class);
        System.out.println(address);
    }

}
