package com.example.demo.mapper;

import com.example.demo.entity.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserMapper {
    SysUser selectById(Integer id);

    SysUser selectByName(String name);
}
