package com.zyj.poolTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName poolTest
 * @author: YaJun
 * @Date: 2021 - 05 - 28 - 11:24
 * @Description: com.zyj.poolTest
 * @version: 1.0
 */
public class poolTest {

    @Test
    public void testC3p0() {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            DataSource datasource = (DataSource) context.getBean("datasource");
            System.out.println(datasource);
            System.out.println("---------------");
            System.out.println(datasource.getConnection());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDruidDataSource() {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            DataSource datasource = (DataSource) context.getBean("druidDataSource");
            System.out.println(datasource);
            System.out.println("---------------");
            System.out.println(datasource.getConnection());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
