package com.syntax.class5;

import java.util.Scanner;

public class WeekendOrWeekday {

	public static void main(String[] args) {
		/*Write a program that will print whether 
		 * it is a weekend or weekday. 
		 * If any day from 1-5 → output
		 *  “It is a weekday”, anyday from 6-7 → 
		 *  output “It is a weekend”, any other day → output “Invalid day”
		 * 
		 */
		
		Scanner h=new Scanner(System.in);
		System.out.println("It is a weekend or Weekday");
		double day=h.nextDouble();

		if(day>1 && day<=5) {
		System.out.println("Weekday");
		}else if(day>=6 && day<=7){
		System.out.println("Weekend");	
		}else {
			System.out.println(" Enter a validay");
		}

	}
}

