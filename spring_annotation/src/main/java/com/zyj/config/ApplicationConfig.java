package com.zyj.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName ApplicationConfig
 * @author: YaJun
 * @Date: 2021 - 05 - 28 - 17:00
 * @Package: com.zyj.config
 * @Description:
 */

// 表示当前类为一个配置类
@Configuration
// 扫描包
@ComponentScan(basePackages = "com.zyj.annotation")
// 引入配置类对象
@Import({DataSourceConfig.class})

public class ApplicationConfig {




}
