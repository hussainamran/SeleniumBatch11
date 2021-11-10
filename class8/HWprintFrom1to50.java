package com.syntax.class8;

public class HWprintFrom1to50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Print numbers from 1 to 50 except those that are divisible by 3
		 */
		
		for(int i=1; i<50; i++) {
			
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}

	}

}
