package com.example.demo.service;

import com.example.demo.entity.CustomUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    /**
     * 查询Uesr
     * @return
     */
    List<CustomUser> SelectUser(CustomUser customUser);
}
