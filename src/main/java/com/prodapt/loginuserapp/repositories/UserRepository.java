package com.prodapt.loginuserapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.loginuserapp.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	User findByUserName(String userName);
	
}
