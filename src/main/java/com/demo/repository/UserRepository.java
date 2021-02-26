package com.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.bean.UserBean;
import com.demo.mapper.UserMapper;

@Repository
public class UserRepository {

	@Autowired UserMapper userMapper;
	
//	UserServiceから呼び出され、UserMapperから受け取った全リスト情報を返す	
	public List<UserBean> selectAllUser() {
		return userMapper.selectAllUser();
	};

//	UserServiceから呼び出され、UserMapperから受け取ったidパラメータのリストのみ返す
	public List<UserBean> selectUserById(Integer id) {
		return userMapper.selectUserById(id);
	};

}
