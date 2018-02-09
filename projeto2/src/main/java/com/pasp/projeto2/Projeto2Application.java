package com.pasp.projeto2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Projeto2Application {

	public static void main(String[] args) {
		ApplicationContext ctx =	SpringApplication.run(Projeto2Application.class, args);
		
		MyController controller = (MyController) ctx.getBean("myController");
		
		controller.hello();
	}
}
