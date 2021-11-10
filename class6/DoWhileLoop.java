package com.syntax.class6;



public class DoWhileLoop {

	public static void main(String[] args) {
		/*
		 * Print number from 30 to 70 using do while loop
		 * print odd numbers from 99 to 1 using do while
		 */
		int i=30;
		
	do {
		System.out.print(+i+" ");
		i++;
	}while(i<=70);
	
	System.out.println(" ");	
	
	
	int x=99;
	do {
		System.out.print(x+" ");
		x--;
	}while(x>=1);
	if(x%2==1) {
	System.out.println("code end");	
	}

}}
