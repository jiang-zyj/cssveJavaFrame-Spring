package com.zyj.lifeCircle;

import com.zyj.annotation.UserService.Impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName LifeCircleTest
 * @author: YaJun
 * @Date: 2021 - 05 - 28 - 16:51
 * @Package: com.zyj.lifeCircle
 * @Description:
 */
public class LifeCircleTest {

    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userServiceImpl = context.getBean("userServiceImpl", UserServiceImpl.class);
        context.close();
    }

}
