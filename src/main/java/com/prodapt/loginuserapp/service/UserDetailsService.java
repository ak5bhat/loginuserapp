package com.prodapt.loginuserapp.service;

import java.util.List;

import com.prodapt.loginuserapp.entities.UserDetails;

public interface UserDetailsService {
	
	//Create Role
	public UserDetails addUser(UserDetails userDetails);
	//Retrieve
	public UserDetails getUserById(Long id);
	
	//Update
	public UserDetails updateUser(UserDetails userDetails);
	
	//Delete
	public void deleteUserById(Long id);
	
	//zRetrieve useres list
	public List<UserDetails> getUsersList();
}


