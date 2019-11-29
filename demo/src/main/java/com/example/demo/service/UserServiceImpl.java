package com.example.demo.service;

import com.example.demo.model.CustomUser;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询User
     * @param customUser user拓展类
     */
    @Override
    public List<CustomUser> SelectUser(CustomUser customUser) {
        return userMapper.SelectUser(customUser);
    }

    /**
     * 新增User
     * @param customUser user拓展类
     */
    @Override
    public List<CustomUser> InsertUser(CustomUser customUser) {
        return userMapper.InsertUser(customUser);
    }

    /**
     * 修改User
     * @param customUser user拓展类
     */
    @Override
    public List<CustomUser> UpdateUser(CustomUser customUser) {
        return userMapper.UpdateUser(customUser);
    }

    /**
     * 删除User
     * @param customUser user拓展类
     */
    @Override
    public List<CustomUser> DeleteUser(CustomUser customUser) {
        return userMapper.DeleteUser(customUser);
    }
}
