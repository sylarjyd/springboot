package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.dao.UserMapper;
import com.example.entity.User;
import com.example.entity.UserInfo;

@Service
public class UserService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private UserMapper userMapper;
	
	
	
	public void insertUser(UserInfo user) {
		jdbcTemplate.update("insert into userinfo values(?,?,?,?)", user.getId()
				,user.getName(),user.getSex(),user.getAddress());
	}
	
	
	public void insertUser2(User user) {
		userMapper.insert(user);
	}
	
}
