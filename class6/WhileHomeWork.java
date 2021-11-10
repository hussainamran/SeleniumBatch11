package com.syntax.class6;

public class WhileHomeWork {

	public static void main(String[] args) {
/*Print numbers from 1 to 100 in 1 line with space
Print numbers from 100 to 1
Print even numbers from 20 to 100 
Print only odd numbers from 100 to 1 	
 */
		//print numbers 1 to 100 in 1 line
		int n=1;
		while(n<=100) {
			System.out.print(n+" ");
			n++;
			
		}
		System.out.println("*************");
		
		// print numbers from 100 to 1.
		
		int i=100;
		while(i>=1) {
			System.out.print(i+" ");
			i--;
		}
		System.out.print("*************");
		//print even number 20 to 100
		
		int j=20;
		while(j<=100) {
			if(j%2==0) {
				System.out.print(j+" ");
				
			}
			j++;
				
		}
		//Print only odd numbers from 100 to 1
		int a=100;
		while(a>=1) {
			if(a % 2==1) {
				System.out.print(a+" ");
			}
			a--;
		}
	
	}

}
