package com.example.demo.controller;

import com.example.demo.entity.CustomUser;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //查询用户信息
    @RequestMapping(value = "/User", method = RequestMethod.GET)
    public List<CustomUser> SelectUser(CustomUser customUser){
        List<CustomUser> users = userService.SelectUser(customUser);
        return users;
    }

    //新增用户信息
    @RequestMapping(value = "/User", method = RequestMethod.POST)
    public List<CustomUser> InsertUser(CustomUser customUser){
        List<CustomUser> users = userService.InsertUser(customUser);
        return users;
    }

}