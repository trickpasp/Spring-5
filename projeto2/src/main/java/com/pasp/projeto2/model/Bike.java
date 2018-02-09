package com.pasp.projeto2.model;

import com.pasp.projeto2.interfaces.Vehicle;

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
