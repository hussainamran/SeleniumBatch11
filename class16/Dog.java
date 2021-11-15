package com.syntax.class16;

public class Dog {
	
	String name;
	static int noofLegs=4;
	String color;
	
	void displaycolor() {
		System.out.println(color);
	}
	
	void displayname() {
		System.out.println(name);
		System.out.println(noofLegs);
	}
	
	void printInfo() {
		displayname();
		displaycolor();
		DisplayLegs();
	}
	static void DisplayLegs() {
		//System.out.println(name);// not allowed 
		System.out.println(noofLegs);
	}

}
