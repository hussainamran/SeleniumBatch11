package com.syntax.class9;

public class PatterenNumberinNastedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 4 rows and 5 culoms
		
		for(int c=1; c<=4; c++) {
			
			for(int r=1; r<=5; r++) {
				System.out.print(r+" ");
			}
			System.out.println();
		}
		
		System.out.println("**************************");
		
		// printing number row and culom
		
		for(int r=5; r>=1; r--) {
			for(int c=1; c<=4; c++) {
				System.out.print(r+" ");
			}
			System.out.println();	
			
			
		}
		
		System.out.println("**************************");
	
		
		for(int r=5; r>=1; r--) {
			for(int c=4; c>=1; c--) {
				System.out.print(c+" ");
			}
			System.out.println();	
	}

}}
