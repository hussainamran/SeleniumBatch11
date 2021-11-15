package com.syntax.class17;

public class constructorDog {
	private String name;
	private String color;
	private String breed;
	private int age;
	private double weight;



	public constructorDog(String dogName, String dogcolor, String dogbreed, int dogage, double dogweight) {
		System.out.println("Dogs constructor is called");
		name=dogName;
		color=dogcolor;
		breed=dogbreed;
		age=dogage;
		System.out.println(dogName);
		weight=dogweight;
	}
	public void printName() {
		System.out.println(name);
	}
	public void printcolor() {
		System.out.println(color);
	}
	public void printbreed() {
		System.out.println(breed);
	}
	public void printage() {
		System.out.println(age);
	}
	public void printweight() {
		System.out.println(weight);
	}
}
