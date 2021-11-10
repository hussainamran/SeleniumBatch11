package com.syntax.class6;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// I want to ask a user their name and age 5 times
		
		Scanner input=new Scanner(System.in);
		int i=5;
		while(i>=1) {
			
		
		System.out.println("Please enter name and age");
		
		String name=input.next();
		int age=input.nextInt();
		
		System.out.println("You nameis "+name+" and your age "+age+" years old");
		
	}
i--;
}}
