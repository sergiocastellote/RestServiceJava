package com.apprest.service;

import java.util.List;

import com.apprest.entities.User;

public interface UserServiceImpl {
	public List<User> getListUsers();
	public void saveUser(User user);
}
