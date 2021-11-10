package com.syntax.class4;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enert an item you want to buy");
		
		String item=input.next();
		System.out.println("Please enert the price of the "+item);
		double price=input.nextDouble();
		
		System.out.println("Please  selected "+item+"with price="+price);
		
		
		
	}

}
