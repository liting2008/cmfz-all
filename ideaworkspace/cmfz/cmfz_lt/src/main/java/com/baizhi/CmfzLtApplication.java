package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.baizhi.dao")
public class CmfzLtApplication {

    public static void main(String[] args) {
        System.out.println("第1次提交");
        System.out.println("第2次提交");
        System.out.println("第3次提交");



        SpringApplication.run(CmfzLtApplication.class, args);
    }

}
