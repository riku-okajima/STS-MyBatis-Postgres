package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.UserBean;
import com.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

//	UserControllerから呼び出され、UserRepositoryから受け取った全リストを返す
	public List<UserBean> selectAllUser() {
		return userRepository.selectAllUser();
	}

//	UserControllerから呼び出され、UserRepositoryから受け取ったパラメータで渡されたidのリストのみ返す
	public List<UserBean> selectUserById(Integer id) {
		return userRepository.selectUserById(id);
	}

}
