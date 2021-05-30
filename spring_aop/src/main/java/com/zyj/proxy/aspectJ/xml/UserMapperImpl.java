package com.zyj.proxy.aspectJ.xml;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName UserMapperImpl
 * @author: YaJun
 * @Date: 2021 - 05 - 30 - 14:19
 * @Package: com.cssve.proxy.aspectJ.xml
 * @Description:
 */
public class UserMapperImpl implements UserMapper{
    @Override
    public void save() {
        System.out.println("执行保存数据操作...");
    }
}
