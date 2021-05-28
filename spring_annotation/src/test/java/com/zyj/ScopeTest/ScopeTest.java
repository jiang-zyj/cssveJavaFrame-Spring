package com.zyj.ScopeTest;

import com.zyj.annotation.UserService.Impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName ScopeTest
 * @author: YaJun
 * @Date: 2021 - 05 - 28 - 16:30
 * @Package: com.zyj
 * @Description:
 */
public class ScopeTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userServiceImpl1 = context.getBean("userServiceImpl", UserServiceImpl.class);
        UserServiceImpl userServiceImpl2 = context.getBean("userServiceImpl", UserServiceImpl.class);
        System.out.println(userServiceImpl1 == userServiceImpl2);
    }

}
