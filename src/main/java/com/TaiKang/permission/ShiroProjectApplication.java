package com.TaiKang.permission;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages ="com.TaiKang.permission.*.dao")
public class ShiroProjectApplication  {
    public static void main(String[] args) {
        SpringApplication.run(ShiroProjectApplication.class,args);
    }
}
