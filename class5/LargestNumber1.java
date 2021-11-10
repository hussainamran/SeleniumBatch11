package com.syntax.class5;

import java.util.Scanner;

public class LargestNumber1 {

	public static void main(String[] args) {
		/*Create a Java program to capture 2 
		 * numbers from a user and define 
		 * which number is the largest.
		 * 
		 */
		Scanner in=new Scanner(System.in);
		System.out.println(" Enter the numbers");
		double num1=in.nextDouble();
		double num2=in.nextDouble();
		if(num1>num2) {
			System.out.println(" Largest number is num1 "+num1);
		}else if(num2>num1) {
			System.out.println("Largest number is num2  "+num2);
		}else {
			System.out.println("Enter a valid number");
		}
	}

}
