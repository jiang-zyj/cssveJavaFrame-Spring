package com.zyj.config;

import com.zyj.annotation.UserDao.Impl.UserDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName ConfigTest
 * @author: YaJun
 * @Date: 2021 - 05 - 28 - 19:07
 * @Package: com.zyj.config
 * @Description:
 */
public class ConfigTest {

    @Test
    public void test() {
        try {
            ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//            DataSource dataSource = context.getBean("dataSource", DataSource.class);
            DataSource dataSource = context.getBean(DataSource.class);
            System.out.println(dataSource);
            System.out.println(dataSource.getConnection());

            UserDaoImpl userDao = context.getBean("userDaoImpl", UserDaoImpl.class);
            System.out.println("---------------------");
            System.out.println(userDao);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
