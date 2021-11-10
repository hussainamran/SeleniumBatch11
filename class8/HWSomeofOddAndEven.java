package com.syntax.class8;

import java.util.Scanner;

public class HWSomeofOddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*Write a program that reads a range of integers (start and end point), 
	 * provided by a user and then from that range prints the sum of the even and odd integers.

	 * 
	 */
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter your start point");
		int start=in.nextInt();
		System.out.println("Please enter your end point");
		int end=in.nextInt();
		int sumeven=0;
		int sumodd=0;
		
		for(int i=start; i<=end; i++) {
			
			if(i%2==0) {
				sumeven+=i;
			}else {
				sumodd+=i;
				
				
			}
		}
		System.out.println("Sumeven number "+sumeven);
		System.out.println("Sumodd number "+sumodd);
		}
	}


