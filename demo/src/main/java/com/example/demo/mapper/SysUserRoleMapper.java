package com.example.demo.mapper;

import com.example.demo.entity.SysUserRole;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserRoleMapper {
    List<SysUserRole> listByUserId(Integer userId);
}
