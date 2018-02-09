package com.pasp.projeto2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("carBean")
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
