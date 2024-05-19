package com.graduation.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 项目名: graduation-design
 * 创建者: Admin
 * 创建时间: 2024/5/19
 * 描述:
 *
 * @author ben-bird
 */
@SpringBootApplication
@MapperScan("com.graduation.account.mapper")
public class AccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class,args);
    }

}
