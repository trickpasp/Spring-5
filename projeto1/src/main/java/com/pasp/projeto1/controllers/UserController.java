package com.pasp.projeto1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pasp.projeto1.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository; 
	
	@RequestMapping("/user")
	public String getUsers(Model model) {
		model.addAttribute("usersList", this.userRepository.findAll());
		
		return "user";
		
	}

}
