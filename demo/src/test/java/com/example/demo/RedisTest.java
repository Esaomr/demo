//package com.example.demo;
//
//import com.example.demo.comm.RedisUtils;
//import com.example.demo.model.User;
//import com.example.demo.service.UserService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import javax.annotation.Resource;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//
//@SpringBootTest
//public class RedisTest {
//    @Resource
//    private RedisUtils redisUtils;
//
//    @Resource
//    private UserService userService;
//
//    //插入缓存数据
//    @Test
////    public void set() {
////        redisUtils.set("redis_key", "redis_vale");
////    }
//    public void setUser() {
//        redisUtils.setUser("user1", userService.Sel(1));
//    }
//
//    //读取缓存数据
//    @Test
//    public void get() {
//        String value = redisUtils.get("redis_key");
//        System.out.println(value);
//    }
//}
