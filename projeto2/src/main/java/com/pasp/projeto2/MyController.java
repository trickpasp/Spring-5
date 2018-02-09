package com.pasp.projeto2;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String hello() {
		
		System.out.println("Entrei nesse método ");
		
		return "hello";
	}
	
}
