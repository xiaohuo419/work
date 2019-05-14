package com.jt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.jt.pojo.User;

public interface UserMapper {
	
	@Select("select * from user")
	List<User> findAll();
	@Insert("insert into user(id,name,age,sex)values(null,#{name},#{age},#{sex})")
	void addUser(User user);
	

}
