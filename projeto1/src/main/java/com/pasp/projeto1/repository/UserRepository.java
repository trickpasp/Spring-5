package com.pasp.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pasp.projeto1.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
