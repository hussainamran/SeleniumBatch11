package com.syntax.class6;

import java.util.Scanner;

public class DoLoopExample {

	public static void main(String[] args) {
		/*
		 * Lete create a secret number (1 to 20)
		 * 
		 * Lets ask user to guess my secret number
		 * 
		 *  Keep asking for a number till user guess the secret number
		 *  
		 */
		
		int secretnumber=78;
		Scanner scan=new Scanner(System.in);
		int userNumber;
		
	do {
		System.out.println("please guess my secret number. It is a number from 1 to 100");
		userNumber=scan.nextInt();
	}while(userNumber!=secretnumber);
	}

}
