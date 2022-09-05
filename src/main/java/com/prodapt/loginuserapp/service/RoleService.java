package com.prodapt.loginuserapp.service;

import com.prodapt.loginuserapp.entities.Role;

public interface RoleService {
	
	//Create Role
	public Role addRole(Role role);
	//Retrieve
	public Role getRoleById(Long id);
	
	//Update
	public Role updateRole(Role role);
	
	//Delete
	public void deleteRoleById(Long id);
	
}
