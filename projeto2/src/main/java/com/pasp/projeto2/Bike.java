package com.pasp.projeto2;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

	@Override
	public void start() {
		System.out.println("Iniciando a Bike");

	}

	@Override
	public void stop() {
		System.out.println("Parando a Bike");

	}

}
