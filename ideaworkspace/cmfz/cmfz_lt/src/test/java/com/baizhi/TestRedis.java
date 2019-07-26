package com.baizhi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Test
    public void test1(){
        stringRedisTemplate.opsForValue().set("name","zhangsan");
    }
    @Test
    public void test2(){
        String name = stringRedisTemplate.opsForValue().get("name");
        System.out.println(name);
    }
}
