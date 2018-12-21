package com.ccm.permission;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan(basePackages ="com.ccm.permission.system.dao")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ShiroProjectApplication extends WebMvcConfigurerAdapter{

    public static void main(String[] args) {
        SpringApplication.run(ShiroProjectApplication.class,args);
    }
}
