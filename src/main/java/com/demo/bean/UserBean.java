package com.demo.bean;

//DB情報を受け取るデータクラス
public class UserBean {
	
//	カラム要素のid,name,ageフィールド
	private Integer id;
	private String name;
	private Integer age;

//	getter,setter
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}
