package com.pasp.projeto2.model;

import org.springframework.stereotype.Component;

import com.pasp.projeto2.interfaces.Vehicle;

@Component
public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Inciando carro");

	}

	@Override
	public void stop() {
		System.out.println("Parando carro");

	}

}
