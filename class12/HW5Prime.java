package com.syntax.class12;

public class HW5Prime {
	
	//Write a method to return whether given number is prime or not?
	
	// prime number not 0-1 it start from 2
	
	boolean isPrime(int number) {
		boolean isPrime=true;
		
		if(number>1) {
			for(int i=2; i<number; i++) {
				
				if(number % i == 0) {
					isPrime=false;
					break;
				}
			}
		}else {
			isPrime=false;
		}
		return isPrime;
	}
	
	public static void main(String []arg) {
		
		HW5Prime inp=new HW5Prime();
		System.out.println(inp.isPrime(2));
		
	}
	
	
	
	
}


