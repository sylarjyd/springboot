package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.IdClass;
import com.example.entity.User;
import com.example.entity.UserInfo;
import com.example.service.UserService;

@Controller
public class SbController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value="/user/userinfo")
	public ModelAndView getUserInfo() {
		HashMap<String,Object> hashMap = new HashMap<>();
		hashMap.put("info", "userinfo");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		modelAndView.addAllObjects(hashMap);
		return modelAndView;
	}
	
	@RequestMapping(value="/user/insertUser")
	public ModelAndView insertUser(String id) {
		UserInfo userInfo = new UserInfo();
		userInfo.setAddress("wuhan"+id);
		userInfo.setName("jyd"+id);
		userInfo.setSex(Integer.valueOf(id)%2==1?"男":"女");
		userInfo.setId(id);
		userService.insertUser(userInfo);
		HashMap<String,Object> hashMap = new HashMap<>();
		hashMap.put("info", "insertUser success");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index2");
		modelAndView.addAllObjects(hashMap);
		return modelAndView;
	}
	
	@RequestMapping(value="/user/insertUser2" ,method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	public ModelAndView insertUser2(@RequestParam(value="id",required=true) String id){
		User user = new User();	
		user.setUserId(Integer.valueOf(id));
		user.setUserName("jdy"+id);
		user.setPhone(id);
		user.setPassword(id);
		userService.insertUser2(user);
		HashMap<String,Object> hashMap = new HashMap<>();
		hashMap.put("info", "insertUser3 success");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index3");
		modelAndView.addAllObjects(hashMap);
		return modelAndView;
	}
}
