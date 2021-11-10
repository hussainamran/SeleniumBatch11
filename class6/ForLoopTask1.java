package com.syntax.class6;

public class ForLoopTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Print numbers from 100 to 1
		
		for(int a=100; a>=1; a--) {
			System.out.print(a+ " ");

	}
		// Print even numbers from 20 to 1 (2 ways)
		for(int b=20; b>=0; b++) {
			if(b % 2==0) {
				System.out.print(b+ " ");
			}
		}

}}
