package com.syntax.class5;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
/*Create a Java program that will ask user to 
 * input city and temperature. Your program should 
 * convert Fahrenheit into celsius and print 
 * “The temperature is the city __ is __”
 * 
 */
	Scanner in=new Scanner(System.in);
	System.out.println("Enter your city");
		String city=in.next();
	System.out.println("Enter the temperature");
		double temp=in.nextDouble();
		double temp1=(temp-32)*5/9;
		
			System.out.println(" The temperature is the city "+city+" is "+temp1);
		}
		

	}


