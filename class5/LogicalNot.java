package com.syntax.class5;

public class LogicalNot {

	public static void main(String[] args) {
		
		boolean boo =!true;
		System.out.println("boo");
		
		boolean zoo=!false;
		System.out.println(zoo);
		
		boolean isRain=false;// if true it will not give me anyout put
		if(!isRain) {
			System.out.println(" I will go for a walk");
			
			String username="test";
			String password="test";
			if (!username.equals(password)) {
				System.out.println(" I am accepting your password");
			}
			boolean selected=true;
			
			if(!selected) {
				System.out.println(" do click");
			}
		}
		

	}

}
