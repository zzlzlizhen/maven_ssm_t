package com.zsm.dao;

import com.zsm.entities.User;


public interface UserDAO {
	User insert(User record);
	User selectByPrimaryKey(Integer id);
}
