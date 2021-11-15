package com.syntax.class17;

public class Constructorcar {
	
	private String name;
	private String make;
	private String model;
	private String color;
	private int year;
	private int engineCC;
	private String VIN;
	private int mileage;
	private int maxSpeed;
	private boolean sunroof;
	
	public Constructorcar() {
		
	}
	public Constructorcar(String carname) {
		name=carname;
	}
	
	public Constructorcar(String carname, String carmake, String carmodel, String carcolor, int caryear, 
			int carengincc, String carvin, int carmileage,int carspeed, boolean carsunroof) {
		name=carname;
		make=carmake;
		model=carmodel;
		color=carcolor;
		year=caryear;
		engineCC=carengincc;
		VIN=carvin;
		mileage=carmileage;
		maxSpeed=carspeed;
		sunroof=carsunroof;
		
		
		
	}
	public void printname() {
		System.out.println(name);
	}
	public void sayHello() {
		System.out.println("hello");
	}

}
