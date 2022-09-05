package com.prodapt.loginuserapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodapt.loginuserapp.entities.Role;
import com.prodapt.loginuserapp.repositories.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepo;
	@Override
	public Role addRole(Role role) {

		return roleRepo.save(role);
	}

	@Override
	public Role getRoleById(Long id) {
		
		Optional<Role> role =roleRepo.findById(id);
		if(role.isPresent()) {
			return role.get();
		}
		return null;
	}

	@Override
	public Role updateRole(Role role) {
		if(roleRepo.existsById(role.getId())) {
			roleRepo.save(role);
		}
		return role;
	}

	@Override
	public void deleteRoleById(Long id) {
		roleRepo.deleteById(id);
	}

}
