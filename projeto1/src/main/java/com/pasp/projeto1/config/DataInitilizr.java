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
			createUser("Patrick Doido Maluco", "patrickdoidomaluco@gmail.com");
			createUser("Gabriel Pedagogo 12 Anos", "gabigogo@gmail.com");
			createUser("Naelio Sentou No Vazo", "naeliovazo@gmail.com");
			createUser("Iarlen Pai Deles", "iarlenpadastro@gmail.com");
			createUser("Fagner Tiwin Front-End Developer 30 dias", "fagnervoltadoparadd@gmail.com");
			createUser("Andreazo Uma Noite Com Rodrigo", "andreazoumanoite@gmail.com");
		}
		
		User user = userRepository.findByEmailQualquerCoisa("patrickdoidomaluco@gmail.com");
		System.out.println(user.getName());
	}
	
	public void createUser(String name, String email) {
		User user = new User(name, email);
		userRepository.save(user);
	}

}
