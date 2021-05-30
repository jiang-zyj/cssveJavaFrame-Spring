package com.zyj.proxy.cglib;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName MyAspect
 * @author: YaJun
 * @Date: 2021 - 05 - 30 - 10:51
 * @Package: com.cssve.proxy.jdk
 * @Description:
 */
public class Advice {


    public void checkAuth() {
        System.out.println("在执行保存操作前进行权限检查...");
    }

    public void delete() {
        System.out.println("记录删除时的时间：" + new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date()));
    }


}
