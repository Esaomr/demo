package com.example.demo.service;

import com.example.demo.model.CustomUser;

import java.util.List;

//@Service
public interface UserService {
    /**
     * 查询User
     * @param customUser user拓展类
     */
    List<CustomUser> SelectUser(CustomUser customUser);

    /**
     * 新增User
     * @param customUser user拓展类
     */
    List<CustomUser> InsertUser(CustomUser customUser);

    /**
     * 修改User
     * @param customUser user拓展类
     */
    List<CustomUser> UpdateUser(CustomUser customUser);

    /**
     * 删除User
     * @param customUser user拓展类
     */
    List<CustomUser> DeleteUser(CustomUser customUser);
}
