package com.vehicles.project;

import java.util.List;

public class Car extends Vehicle {
	
	//metodos

	public Car(String plate, String brand, String color) {
		super(plate, brand, color);
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception 
	{
		if (wheels.size() != 2)
			System.out.println(" ERROR, Cars only has 2 front wheels and 2 rear wheels. \n");
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			System.out.println(" ERROR, right wheel and left wheel must be equals. \n");
			throw new Exception();

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
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
	
	public String get_carData() { //getter
		return "Plate: " + plate + " | Brand: " + brand + "| Color: " + color;
	}

}
