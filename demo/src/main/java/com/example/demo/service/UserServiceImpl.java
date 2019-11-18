package com.example.demo.service;

import com.example.demo.entity.CustomUser;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<CustomUser> SelectUser(CustomUser customUser) {
        return userMapper.SelectUser(customUser);
    }
}
