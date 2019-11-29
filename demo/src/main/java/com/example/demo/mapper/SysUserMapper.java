package com.example.demo.mapper;

import com.example.demo.model.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserMapper {
    SysUser selectById(Integer id);

    SysUser selectByName(String name);
}
