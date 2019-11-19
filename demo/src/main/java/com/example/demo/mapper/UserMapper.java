package com.example.demo.mapper;

import com.example.demo.entity.CustomUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
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
