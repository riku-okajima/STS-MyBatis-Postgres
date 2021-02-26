package com.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.demo.bean.UserBean;

@Mapper
public interface UserMapper {
//	UserMapper.xmlから全リストを受け取るメソッド
//	UserServiceクラスのselectAllUser()メソッドの戻り値となる	
	public List<UserBean> selectAllUser();

//	UserMapper.xmlからパラメータで渡されたidのリストを受け取るメソッド
//	UserServiceクラスの()メソッドのselectUserById()メソッドの戻り値となる
	public List<UserBean> selectUserById(Integer id);

}
