package com.pasp.projeto1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.pasp.projeto1.model.User;

public interface UserRepository extends MongoRepository<User, Long>{
		
	@Query("{ 'email': ?0 }")
	User findByEmailQualquerCoisa(String email);
	
	User findByNameIgnoreCaseLike(String name);
	
}
