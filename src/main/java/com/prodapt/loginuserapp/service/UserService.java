package com.prodapt.loginuserapp.service;

import com.prodapt.loginuserapp.entities.User;
import com.prodapt.loginuserapp.exceptions.InvalidCredentialsException;

public interface UserService {

	//Create Role
		public User addUser(User user);
		//Retrieve
		public User getUserByName(String userName);
		
		//Update
		public User updateUser(User user);
		
		//Delete
		public void deleteUserById(Long id);
		
		public User loginUser(User user) throws InvalidCredentialsException;
		
		
}
