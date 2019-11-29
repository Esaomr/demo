package com.example.demo.mapper;

import com.example.demo.model.SysPermission;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysPermissionMapper {
    List<SysPermission> listByRoleId(Integer roleId);
}
