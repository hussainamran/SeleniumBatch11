package com.syntax.class11;

public class Car {
	
	String make;
	String color;
	String model;
	int year;
	double milage;
	
	void moveForward() {
		System.out.println("Moving forward");
		moveBackword();
	}
	void applyBreaks() {
		System.out.println("Applying breaks");
	}
	void moveBackword() {
		System.out.println("moving backward");
	}
	
	public static void main(String[] args) {
		
		Car ayshasCar=new Car();
		ayshasCar.make="Tesla";
		ayshasCar.model="S";
		ayshasCar.color="Black";
		
		System.out.println("Ayshas car is "+ayshasCar.make);
		System.out.println("Ayshas car model is "+ayshasCar.model);
		System.out.println("Ayshas car color is "+ayshasCar.color);
		ayshasCar.moveForward();
		ayshasCar.applyBreaks();
		ayshasCar.moveBackword();
	}
	

}
