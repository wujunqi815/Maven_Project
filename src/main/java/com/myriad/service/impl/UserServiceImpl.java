package com.myriad.service.impl;

import com.myriad.pojo.User;
import com.myriad.service.IUserService;
import com.myriad.dao.UserMapper;;

public class UserServiceImpl implements IUserService {
	private UserMapper userMapper;
	
	@Override
	public User getUserById(int id) {
		return this.userMapper.selectByPrimaryKey(id);
	}

}
