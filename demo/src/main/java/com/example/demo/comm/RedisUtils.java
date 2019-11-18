package com.example.demo.comm;

import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisUtils {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;    //操作k-v都是String

    @Autowired
    private RedisTemplate redisTemplate;    //操作k-v都是Object

    @Autowired
    RedisTemplate<String, User> userRedisTemplate;


    //读取缓存
    public String get(final String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    //写入缓存
    public boolean set(final String key, String value) {
        boolean result = false;
        try {
            stringRedisTemplate.opsForValue().set(key, value);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean setUser(final String key, User value) {
        boolean result = false;
        try {
            userRedisTemplate.opsForValue().set(key, value);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    //更新缓存
    public boolean getAndSet(final String key, String value) {
        boolean result = false;
        try {
            stringRedisTemplate.opsForValue().getAndSet(key, value);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    //删除缓存
    public boolean delete(final String key) {
        boolean result = false;
        try {
            stringRedisTemplate.delete(key);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
