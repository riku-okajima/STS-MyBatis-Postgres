package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.UserBean;
import com.demo.service.UserService;

//RestController →　Viewに遷移せず、メソッドの戻り値がレスポンスのコンテンツとなる・・・「list」が返される
@RestController
public class UserController {
	
//	Autowired　→　他クラスの呼び出し（new）
	@Autowired
	private UserService userService;
	
//	RequestMapping →　URLとメソッドのマッピング（紐づけ）　・・・　//localhost:8080　で表示
	@RequestMapping(value="/")
//	RequestParam → パラメータを受け取る 
//	name → パラメータ名指定 
//	required → パラメータを任意で指定する場合false
//	id → パラメータの値を格納する引数	
	public List<UserBean> list(@RequestParam(name="id", required = false) Integer id) {
//		idパラメータが無ければ全リストを取得して表示（selectAllUser）
		List<UserBean> list = null;
		if(id == null) {
			list = userService.selectAllUser();
//		idパラメータがあればそのidをUserServiceに渡し、そのidのリストのみを取得して表示（selectByUserId)
		} else {
			list = userService.selectUserById(id);
		}
		return list;
	}
}
