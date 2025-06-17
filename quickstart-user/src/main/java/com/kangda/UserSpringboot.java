package com.kangda;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//Springboot启动类, 启动类就是包含main方法的class
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.kangda.mapper")
//@EnableCaching
//@EnableScheduling
public class UserSpringboot {

    public static void main(String[] args) {

        SpringApplication.run(UserSpringboot.class, args);
    }
}
