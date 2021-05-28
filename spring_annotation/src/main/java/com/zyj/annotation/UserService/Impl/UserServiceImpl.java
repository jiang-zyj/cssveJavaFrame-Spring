package com.zyj.annotation.UserService.Impl;

import com.zyj.annotation.UserDao.UserDao;
import com.zyj.annotation.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName UserServiceImpl
 * @author: YaJun
 * @Date: 2021 - 05 - 28 - 15:43
 * @Package: com.zyj.annotation.UserService.Impl
 * @Description:
 */
@Service("userService")
@Scope("prototype")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 创建 bean
     */
    @PostConstruct
    public void startCreateBean() {
        System.out.println("bean被创建了...");
    }

    /**
     * 销毁 bean
     */
    @PreDestroy
    public void destroy() {
        System.out.println("bean被销毁了...");
    }


    @Value("tom")
    private String name;

    @Override
    public void query() {
        System.out.println(name + "实现了业务操作");
        userDao.query();
    }
}
