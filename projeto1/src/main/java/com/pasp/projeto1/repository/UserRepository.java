package com.pasp.projeto1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pasp.projeto1.model.User;

public interface UserRepository extends MongoRepository<User, String>{
		
	User findByEmail(String email);
	
	User findByNameIgnoreCase(String name);
	
}
