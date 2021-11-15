package com.syntax.class17;

public class Tesk5 {
	
	/*Write a Student class   that have instance variables name and address. 
	 * Create a constructor that will initialize those variables. Print name & address of given 
	 *  student using displayInfo method.
	 * 
	 */
	
	private String name;
	private String address;
	
	public Tesk5(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public void displayInfo() {
		System.out.println(name+" "+address);
	}
	

}
