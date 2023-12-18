package com.demo.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.demo.model.User;
import com.demo.demo.repo.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo repo;
	
	public User addUser(User user) {
		// Saving the user to DB.
		repo.save(user);
		return user;		
		
	}
	

}
