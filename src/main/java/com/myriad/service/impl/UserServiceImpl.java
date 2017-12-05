package com.myriad.service.impl;

import com.myriad.pojo.User;
import com.myriad.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myriad.dao.UserMapper;;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserById(int id) {
		return this.userMapper.selectByPrimaryKey(id);
	}

}
