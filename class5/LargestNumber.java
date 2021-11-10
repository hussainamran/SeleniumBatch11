package com.syntax.class5;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Pleae Enter the first"
				+ " largest number");
		int num1=in.nextInt();
		System.out.println("Please Enter the second largest number");
		int num2=in.nextInt();
		System.out.println("Please Enter the third largest number");
		int num3=in.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println(num1+"is the largest number");
		}else if(num2>num1 && num2>num3) {
			System.out.println(num2+" is the largest number");
		}else if(num3>1 && num3>2) {
			System.out.println(num3+" is the largest number");
		}
		
		

	}

}
