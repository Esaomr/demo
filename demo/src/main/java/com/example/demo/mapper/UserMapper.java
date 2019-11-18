package com.example.demo.mapper;

import com.example.demo.entity.CustomUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
	List<CustomUser> SelectUser(CustomUser customUser);
}
