package com.syntax.class6;

import java.util.Scanner;

public class CreateCalculator {

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
		char operator=input.next().charAt(0);
		System.out.println("Enter second number");
		int num1=input.nextInt();
		int result=0;
		
		switch(operator){
		case '+':
			result=num+num1;
		break;
		case '-':
			result=num-num1;
		break;
		case '/':
			result=num/num1;
		break;
		case '*':
			result=num*num1;
		break;
		default:
			result=0;
		
		}
		System.out.println("Result is " +result);
	}

}
