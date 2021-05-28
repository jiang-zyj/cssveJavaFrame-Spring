package com.zyj;

import com.zyj.annotation.UserDao.Impl.UserDaoImpl;
import com.zyj.annotation.UserDao.UserDao;
import com.zyj.annotation.UserService.UserService;
import com.zyj.config.ApplicationConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName springAndJunitTest
 * @author: YaJun
 * @Date: 2021 - 05 - 28 - 20:14
 * @Package: com.zyj
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 读取配置文件/加载配置类
//@ContextConfiguration(locations = {"applicationContext.xml","beans.xml"})
@ContextConfiguration(classes = {ApplicationConfig.class})
public class springAndJunitTest {

    @Autowired
    private UserService userService;

    @Autowired
    private DataSource dataSource;

    @Autowired
    private DataSource druidDataSource;

    @Test
    public void test() {
//        userService.query();

//        try {
//            System.out.println(dataSource);
//            System.out.println(dataSource.getConnection());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        try {
            System.out.println(druidDataSource);
            System.out.println(druidDataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
