package com.pasp.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pasp.projeto1.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	@Query("select u from User u where u.name like %?1%")
	User findByNameQualquerCoisa(String name);
	
	User findByEmail(String email);
	
}
