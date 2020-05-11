package com.vehicles.project;

import java.util.List;
import java.util.Scanner;

public class Fase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String plate, brand, color, frntWheelBrand, bckWheelBrand;
		Car car1= new Car("", "", "");
		Bike bike1= new Bike("","","");
		double frntWheelDiam, bckWheelDiam;
		int contNum=0, contChar=0, i=0, cob=0;
		
		do
		{
			System.out.println("Do you want to create a Car or a Bike?");
			System.out.println("Please SELECT : Car = 1 / Bike = 2");
			cob=Integer.parseInt(sc.nextLine());
			
			if(cob<1 || cob>2)
			{
				System.out.println("The option you select is not valid");
			}
		}while(cob<1 || cob>2);
		
		if(cob==1)
		{		
		do {
				contNum=0;
				contChar=0;
				
				System.out.println("Enter the PLATE of the car: ");
				plate=sc.nextLine();
		
				for(i=0; i<(plate.length()); i++)
				{
					if(Character.isDigit(plate.charAt(i)))
					{
					contNum++;
					}
					if(Character.isLetter(plate.charAt(i)))
					{
						contChar++;
					}
				}
				if(contNum>4)
				{
					System.out.println("SORRY, plates has no more than 4 numbers. \n PLZ RE-enter the PLATE. ");
				}
				if(contChar>3)
				{
					System.out.println("SORRY, plates has no more than 3 letters. \n PLZ RE-enter the PLATE. ");
				}
			
			}while(contNum>4 || contChar>3);
			
		
		car1.set_plate(plate);
		
		System.out.println("Please, enter the BRAND of the car: ");
		car1.set_brand(sc.nextLine());
		System.out.println("Please, enter the COLOR of the car: ");
		car1.set_color(sc.nextLine());
		
		System.out.println(car1.get_carData());	
		
		
		System.out.println("\nPlease, enter the brand of the FRONT-WHEELS of the car: ");
		frntWheelBrand= sc.nextLine();
		
		
		do {
			System.out.println("\nPlease, enter the diameter of the FRONT-WHEELS of the car: ");
			frntWheelDiam = Double.parseDouble(sc.nextLine());
			
			if(frntWheelDiam<0.4 || frntWheelDiam>4)
			{
				System.out.println("That is not a correct size..");
			}
		}while(frntWheelDiam<0.4 || frntWheelDiam>4);
					
		
			
		System.out.println("\nPlease, enter the brand of the REAR-WHEELS of the car: ");
		bckWheelBrand= sc.nextLine();
		
		do {
			System.out.println("\nPlease, enter the diameter of the REAR-WHEELS of the car: ");
			bckWheelDiam = Double.parseDouble(sc.nextLine());
			
			if(bckWheelDiam<0.4 || bckWheelDiam>4)
			{
				System.out.println("That is not a correct size..");
			}
		}while(bckWheelDiam<0.4 || bckWheelDiam>4);				 
		
		Wheel Fw1= new Wheel(frntWheelBrand, frntWheelDiam);
		Wheel Rw1= new Wheel(bckWheelBrand, bckWheelDiam);
		}
		//si elige moto:
		if(cob==2)
		{
			
			do {
				contNum=0;
				contChar=0;
				
				System.out.println("Enter the PLATE of the bike: ");
				plate=sc.nextLine();
		
				for(i=0; i<(plate.length()); i++)
				{
					if(Character.isDigit(plate.charAt(i)))
					{
					contNum++;
					}
					if(Character.isLetter(plate.charAt(i)))
					{
						contChar++;
					}
				}
				if(contNum>4)
				{
					System.out.println("SORRY, plates has no more than 4 numbers. \n PLZ RE-enter the PLATE. ");
				}
				if(contChar>3)
				{
					System.out.println("SORRY, plates has no more than 3 letters. \n PLZ RE-enter the PLATE. ");
				}
			
			}while(contNum>4 || contChar>3);
			
		
		bike1.set_plate(plate);
		
		System.out.println("Please, enter the BRAND of the car: ");
		bike1.set_brand(sc.nextLine());
		System.out.println("Please, enter the COLOR of the car: ");
		bike1.set_color(sc.nextLine());
		
		System.out.println(bike1.get_bikeData());	
		
		
		System.out.println("\nPlease, enter the brand of the FRONT-WHEEL of the bike: ");
		frntWheelBrand= sc.nextLine();
		
		
		do {
			System.out.println("\nPlease, enter the diameter of the FRONT-WHEEL of the bike: ");
			frntWheelDiam = Double.parseDouble(sc.nextLine());
			
			if(frntWheelDiam<0.4 || frntWheelDiam>4)
			{
				System.out.println("That is not a correct size..");
			}
		}while(frntWheelDiam<0.4 || frntWheelDiam>4);
					
		
			
		System.out.println("\nPlease, enter the brand of the REAR-WHEEL of the bike: ");
		bckWheelBrand= sc.nextLine();
		
		do {
			System.out.println("\nPlease, enter the diameter of the REAR-WHEEL of the bike: ");
			bckWheelDiam = Double.parseDouble(sc.nextLine());
			
			if(bckWheelDiam<0.4 || bckWheelDiam>4)
			{
				System.out.println("That is not a correct size..");
			}
		}while(bckWheelDiam<0.4 || bckWheelDiam>4);				 
		
		Wheel Fw1= new Wheel(frntWheelBrand, frntWheelDiam);
		Wheel Rw1= new Wheel(bckWheelBrand, bckWheelDiam);
			
		}
	}
		

}
