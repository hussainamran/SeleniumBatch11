package com.syntax.class5;

import java.util.Scanner;

public class LoanSpecilist {

	public static void main(String[] args) {
		/* You are a loan specialist and you need 
		 * to ask user what is the amount of 
		 * loan is needed. If loan is less or equal 
		 * to 200,000 then you would lend the money 
		 * otherwise you would reject the client.
		 */
	Scanner nu=new Scanner(System.in);
	System.out.println(" What is the loan amount is needed");
	double loan=nu.nextDouble();
	if(loan<=200000) {
		System.out.println(" We will lend you money");
	}else {
		System.out.println(" We will reject the loan");
	}

	}

}
