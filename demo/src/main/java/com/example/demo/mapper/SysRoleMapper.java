package com.example.demo.mapper;

import com.example.demo.entity.SysRole;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRoleMapper {
    SysRole selectById(Integer id);

    SysRole selectByName(String name);
}
