package com.example.demo.controller;

import com.example.demo.model.CustomUser;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * User页面跳转
     */
    @RequestMapping(value = "/User/{page}", method = RequestMethod.GET)
    public String UserPageSkip(@PathVariable("page") String page){
        return page;
    }

    /**
     * 查询用户信息
     * @param customUser user拓展类对象
     */
    @RequestMapping(value = "/User", method = RequestMethod.GET)
    @ResponseBody
    public List<CustomUser> SelectUser(CustomUser customUser){
        List<CustomUser> users = userService.SelectUser(customUser);
        return users;
    }

    /**
     * 新增用户信息
     * @param customUser user拓展类对象
     */
    @RequestMapping(value = "/User", method = RequestMethod.POST)
    @ResponseBody
    public List<CustomUser> InsertUser(CustomUser customUser){
        List<CustomUser> users = userService.InsertUser(customUser);
        return users;
    }

    /**
     * 修改用户信息
     * @param customUser user拓展类对象
     */
    @RequestMapping(value = "/User", method = RequestMethod.PUT)
    @ResponseBody
    public List<CustomUser> UpdateUser(CustomUser customUser){
        List<CustomUser> users = userService.UpdateUser(customUser);
        return users;
    }

    /**
     * 删除用户信息
     * @param customUser user拓展类对象
     */
    @RequestMapping(value = "/User", method = RequestMethod.DELETE)
    @ResponseBody
    public List<CustomUser> DeleteUser(CustomUser customUser){
        List<CustomUser> users = userService.DeleteUser(customUser);
        return users;
    }

}