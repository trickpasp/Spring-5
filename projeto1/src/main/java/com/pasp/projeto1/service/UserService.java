package com.pasp.projeto1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pasp.projeto1.model.User;
import com.pasp.projeto1.repository.UserRepository;

//Classes services serve para fazer as regras de negócio da aplicação

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}

}
