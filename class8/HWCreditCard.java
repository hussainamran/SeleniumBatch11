package com.syntax.class8;

import java.util.Scanner;

public class HWCreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Create a program that will keep asking user to apply for a credit card. 
		 * As soon you get “yes” from a user program should stop asking.
		 * 
		 */

			Scanner in=new Scanner(System.in);
			String answer;
			
			do {
				System.out.println("Do you like to apply for a credit card");
				answer=in.next();
			}
		while(!answer.equalsIgnoreCase("yes"));
			System.out.println("You are very lucky");
			
		}
			
	}


