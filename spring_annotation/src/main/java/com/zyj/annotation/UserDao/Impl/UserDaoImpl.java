package com.zyj.annotation.UserDao.Impl;

import com.zyj.annotation.UserDao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName UserDaoImpl
 * @author: YaJun
 * @Date: 2021 - 05 - 28 - 15:44
 * @Package: com.zyj.annotation.UserDao.Impl
 * @Description:
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void query() {
        System.out.println("Mapper层实现Query方法");
    }
}
