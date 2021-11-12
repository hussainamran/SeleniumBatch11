package com.syntax.class15;

public class Dog {

	String name; // Instance variable we use when data is keep changing 
	String color;// instance variable
	static int noofLegs=4;// when we know data will be same almost all the time
	
	void sleep() {
		int times=3;
		System.out.println(times);
		System.out.println(name+" is sleeping");
	}
	void eat() {
		System.out.println(name+ " can eat");
	}
}
