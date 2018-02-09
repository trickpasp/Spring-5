package com.pasp.projeto1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pasp.projeto1.service.UserService;

//Nunca usar regra de negócio nas classes controllers

@Controller
public class UserController {
	
	@Autowired
	private UserService userService; 
	
	@RequestMapping("/user")
	public String getUsers(Model model) {
		model.addAttribute("usersList", this.userService.findAll());
		
		return "user";
		
	}

}
