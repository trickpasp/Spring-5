package com.pasp.projeto1.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.pasp.projeto1.model.User;
import com.pasp.projeto1.repository.UserRepository;

//Essa classe serve para dar a carga inicial para nossa aplicação

@Component
public class DataInitilizr implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	UserRepository userRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {

		List<User> users = userRepository.findAll();

		if (users.isEmpty()) {
			User user = new User();
			User user1 = new User();
			user.setName("Patrick da Silva Pereira");
			user.setEmail("patrick@gmail.com");
			user1.setName("Patrick da Silva Pereira");
			user1.setEmail("patrick@gmail.com");

			userRepository.save(user);
			userRepository.save(user1); 
		}
	}

}
