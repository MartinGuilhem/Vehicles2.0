package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
//atributos
	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>(); 

	//constructores
	public Vehicle(String plate, String brand, String color) { //setter
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}
	
	
	
}
