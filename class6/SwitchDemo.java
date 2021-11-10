package com.syntax.class6;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		/* We need to capture a country from user
		 * base on the county we have to define a 
		 * favorite food
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the country");
		String country=input.next();
		System.out.println("Enter the favorite food");
		String food=null;
		
		switch (country.toLowerCase()){
			case "usa": 
			food= "Burger";
				break;
			case "mexico":
				food="Taco";
				break;
			case "india":
				food="Curry";
				break;
			case "italy":
				food="Pizza";
				break;
				default:
					food="Unknown";
			if(!food.equals("Unknown")) {
				System.out.println("If your country is"+country+" your favorite food is"+food);
				
			}else {
				System.out.println("Please try another country");
			}
				
		}
	}

}
