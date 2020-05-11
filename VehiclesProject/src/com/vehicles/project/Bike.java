 package com.vehicles.project;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}
	
	public void set_plate(String plate) { //setter
		this.plate=plate;		
	}
	
	public void set_brand(String brand) { //setter
		this.brand=brand;		
	}	
	
	public void set_color(String color) { //setter
		this.color=color;		
	}
	
	public String get_bikeData() { //getter
		return "Plate: " + plate + " | Brand: " + brand + "| Color: " + color;
	}




}


