package com.zyj.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName DataSourceConfig
 * @author: YaJun
 * @Date: 2021 - 05 - 28 - 19:23
 * @Package: com.zyj.config
 * @Description:
 */
@PropertySource("db.properties")
public class DataSourceConfig {

    @Value("${jdbc.Driver}")
    private String driverClassName;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    // @Bean 注解【写在方法的头部】    表示将当前方法的返回值交给 IOC 容器中

    @Bean("dataSource")
    public DataSource createPoolDataSource() {
        try {
            // 初始化连接池对象【数据源对象】
            ComboPooledDataSource dataSource = new ComboPooledDataSource();
            dataSource.setDriverClass(driverClassName);
            dataSource.setJdbcUrl(url);
            dataSource.setUser(username);
            dataSource.setPassword(password);

            return dataSource;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Bean("druidDataSource")
    public DataSource createDruidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }

}
