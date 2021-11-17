package com.syntax.class17;

public class Tesk3 {

	/*Write a java class that have 4 constructors with 4 different 
	 * access levels of constructors(private,public,default,protected)
	 *  and create 4 objects of this class: 1 - inside same class; 2 - from outside 
	 *  the class; 3 - from different class inside different package  and observe result.
	 * 
	 */
	
	private Tesk3(int age,String name) {
		System.out.println("I am Privata constructors class");
	}
	public Tesk3(String name) {
		System.out.println("I am Public constructors class");
	}
	Tesk3(){
		System.out.println("I am Default constructors class");
	}
	protected Tesk3(double number) {
		System.out.println("I am Protected constructors class");
	}
	
	public static void main(String[] args) {
		new Tesk3(13,"name");
		new Tesk3("name");
		new Tesk3();
		new Tesk3(12.3);
	}
	
}
