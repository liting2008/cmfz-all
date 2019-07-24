package com.baizhi.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CacheApplication {

    public static void main(String[] args) {
        System.out.println("测试");
        System.out.println("测试2");
        System.out.println("测试3");

        SpringApplication.run(CacheApplication.class, args);
    }
}
