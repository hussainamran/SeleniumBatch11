package com.syntax.class13HW;

import java.util.Scanner;

public class HWTask1 {

	public static void main(String[] args) {
		
		/*write a program that reads two people names and if they expecting boy or girl?
		 * Base on the input suggests a name for a baby.
		 */
		
		Scanner obj=new Scanner(System.in);
		String momFname;
		String dadFname;
		String BabyName;
		
		
		System.out.println("Enter mom first name");
		momFname=obj.next();
		System.out.println("Enter dad first name");
		dadFname=obj.next();
		System.out.println("Enter BabyName name");
		BabyName=obj.next();
		
		if(momFname.equalsIgnoreCase("Mary")&& dadFname.equalsIgnoreCase("Daniel")&& BabyName.equalsIgnoreCase("DANRY")) {
			 System.out.println("It's baby boy");
		}else {
			System.out.println("It's baby girl");
		}
		
		
		
		
	}

}
