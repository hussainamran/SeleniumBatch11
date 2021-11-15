package com.syntax.class17;

public class ConstructorCow {

	static int price=5;
	String name;
	String breed;
	String color;
	int age;
	double weight;
	
	public ConstructorCow() {
		System.out.println("important line of code");
		
	}

	public ConstructorCow(String name) {
		this();
		this.name = name;
	}

	public ConstructorCow(String name, String breed) {
		
		this(name);
		this.breed = breed;
	}

	public ConstructorCow(String name, String breed, String color) {
		
		this(name,breed);
		this.color = color;
	}

	public ConstructorCow(String name, String breed, String color, int age) {
		
		this(name,breed,color);
		this.age = age;
	}

	public ConstructorCow(String name, String breed, String color, int age, double weight) {
		this(name,breed,color,age);
		this.weight = weight;
	}
	void printname() {
		System.out.println(name);
	}
	void printAllInfo() {
		System.out.println("name "+name+ "breed "+breed+ "color "+color+ "age "+age+ "weight "+weight);
	}
}
