package com.syntax.class12;

public class Dog {
	
	String name;
	String color;
	String eyes;
	
	String typename;
	int age;
	int legs;
	
	String brendname;
	String hight;
	String tail;
	
	void walk() {
		System.out.println("Dog is walikg");
	}
	void sleep() {
		System.out.println("Dog is sleeping");
	}
	void eat() {
		System.out.println("Dog eating");
	}
	void play() {
		System.out.println("Dog is playing");
	}
	void jump() {
		System.out.println("Dog is Jumping");
	}
	void burk() {
		System.out.println("Dog is burking");
	}
	void swim() {
		System.out.println("Dog is Swiming");
	}
	void help() {
		System.out.println("Dog is helping");
	}
	void run() {
		System.out.println("Dog is rinning");
	}
	
	
	public static void main(String []arg) {
		
		Dog type=new Dog();
		type.name="Bulldog";
		type.color="red";
		type.eyes="Black";
		
		type.typename="Husky";
		type.age=5;
		type.legs=4;
		
		type.brendname="Labrador";
		type.hight="5in";
		type.tail="one";
		
		System.out.println();
		System.out.println("My dog name is "+type.name);
		System.out.println("My dog color is "+type.color);
		System.out.println("My dog eyes is "+type.eyes);
		
		System.out.println();
		System.out.println("My dog name is "+type.typename);
		System.out.println("My dog age is "+type.age);
		System.out.println("My dog name is "+type.legs);
		
		System.out.println();
		System.out.println("My dog name is "+type.brendname);
		System.out.println("My dog hight is "+type.hight);
		System.out.println("My dog has one "+type.tail);
		
		
		
	}
	

}
