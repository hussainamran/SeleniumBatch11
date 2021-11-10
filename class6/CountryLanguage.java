package com.syntax.class6;

import java.util.Scanner;

public class CountryLanguage {

	public static void main(String[] args) {
		/*Ask user to enter their country and
		 *  capture it. 
		 * Once values are captured print which 
		 * language user speaks.
		 * 
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your country");
		String country=input.next();
		String language;
		
		switch(country.toLowerCase()) {
		case "usa":
		case "australia":
		case "england":
			language="english";
			break;
		case "india":
			language="Urdu";
			break;
		case "mexico":
			language="spanish";
			break;
			default:
				language="Unknown";
		
		}
		if(!language.equals("Unknown")) {
			System.out.println("We speak "+language+" country is "+country);
		}else {
			System.out.println("Enter the correct country");
			
		}
	}

}
