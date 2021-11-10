package com.syntax.class6;

public class ForLoopTask {

	public static void main(String[] args) {
	/*Print numbers from 1 to 100 in 1 line with space
	 * Print numbers from 100 to 1
	 * Print even numbers from 20 to 1 (2 ways)
	 * Print odd numbers between 20 and 50 (2 ways)
	 */
		
		for(int i=1; i<=100;i++) {
			System.out.print(i+ " ");
		}
		System.out.println("**********************");
		
		
		for(int j=100; j>=1; j--) {
			System.out.print(j+ " ");
	}
		System.out.println("**********************");
		
		// one way is to find even number a+=2  another if(a%2==0)
		
		for(int a=2; a<=20; a++) {
			if(a % 2==0){
			System.out.print(a+" ");
		}}
		
		// one way is to find even number a+=2  another if(a%2==0)
		System.out.println("**********************");
		
		for(int c=20; c>=2; c-=2) {
			System.out.print(c+" ");
				
			
		}
		System.out.println("**********************");
		
// one way is to get odd number
		for(int b=20; b<=50; b++) {
			if(b%2==1) {
			System.out.print(b+" ");
		
		
			}
		
		}
		
		System.out.println("**********************");
		
		for(int d=50; d>=20; d-=1) {
			
			System.out.print(d+" ");
		}
	}}
