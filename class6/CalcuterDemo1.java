package com.syntax.class6;

import java.util.Scanner;

public class CalcuterDemo1 {

	public static void main(String[] args) {
		/* Using scanner class create calculator. 
		 * Allow user to enter 2 numbers and operator
		 * (+,-,*,/). Based on operator provide the 
		 * result to user.Please complete this assignment
		 *  in 2 ways: using if statement and switch case.
		* 
		*/
	Scanner input=new Scanner(System.in);
	System.out.println("Enter first number");
	int num=input.nextInt();
	System.out.println("Enter an operator +, -, /,*");
	String operator=input.next();
	System.out.println("Enter second number");
	int num1=input.nextInt();
	int result=0;
				
	if(operator.equals("+")) {
		result=num+num1;
		System.out.println("result " +result);
	}else if(operator.equals("-")) {
		result=num-num1;
		System.out.println("result " +result);
	}else if(operator.equals("/")){
		result=num/num1;
		System.out.println("result " +result);
	}else if(operator.equals("*")) {
		result=num*num1;
		System.out.println("result " +result
				);
		
	}
				
	}

}
