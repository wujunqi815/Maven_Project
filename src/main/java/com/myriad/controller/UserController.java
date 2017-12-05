package com.myriad.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myriad.pojo.User;
import com.myriad.service.IUserService;

@Controller
public class UserController {
	@Resource
	private IUserService userService;
	
	public IUserService getUserService(){
		return userService;
	}
	
	public void setUserService(IUserService userService){
		this.userService = userService;
	}
	
	@RequestMapping(value="/showUser")
	public String showUser(HttpServletRequest request, ModelMap model){
		User u = userService.getUserById(1);
		System.out.println("here " + u.getName());
		request.setAttribute("user", u);
		return "showUser";
	}
}
