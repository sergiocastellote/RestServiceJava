package com.apprest.service;

import java.util.List;

import com.apprest.dao.UserDAO;
import com.apprest.entities.User;

public class UserService implements UserServiceImpl{
	
	UserDAO userDao = new UserDAO();

	@Override
	public List<User> getListUsers() {
		return userDao.listUsers();
		
	}

}
