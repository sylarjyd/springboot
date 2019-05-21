package com.example.entity;

public class UserInfo {
	private String id;
	private String name;
	private String sex;
	private String address;
	
	
	
	public UserInfo() {
		super();
	}
	
	
	
	public UserInfo(String id) {
		super();
		this.id = id;
	}



	public UserInfo(String id, String name, String sex, String address) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}