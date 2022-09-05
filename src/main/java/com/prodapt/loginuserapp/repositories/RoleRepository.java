package com.prodapt.loginuserapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.loginuserapp.entities.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

	
}
