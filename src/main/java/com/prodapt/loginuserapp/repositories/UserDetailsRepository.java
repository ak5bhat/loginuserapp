package com.prodapt.loginuserapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.loginuserapp.entities.User;
import com.prodapt.loginuserapp.entities.UserDetails;

@Repository
public interface UserDetailsRepository extends CrudRepository<UserDetails, Long> {

	User findByEmail(String email);
}
