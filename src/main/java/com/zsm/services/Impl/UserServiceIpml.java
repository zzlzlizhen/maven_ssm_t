package com.zsm.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsm.dao.UserDAO;
import com.zsm.entities.User;
import com.zsm.services.UserService;


@Service("userService")
public class UserServiceIpml implements UserService {
	@Autowired
	private UserDAO userDao;

	@Override
	public User getUserById(String id) {
		// TODO Auto-generated method stub
		return userDao.selectByPrimaryKey(Integer.parseInt(id));
	}


}
