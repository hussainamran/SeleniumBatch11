package com.syntax.class10;

public class Project1TeskOne {

	public static void main(String[] args) {
		
		
		/* Create a 2D array of integer values. Print the sum of all numbers.
		 * 
		 */
		
		int sum=0;
		int[][] numbers= {
				{2,12,34,45,56},
				
				{34,41, 56},
			
				
				
			
		};
		
		sum=0;
		for(int i=0; i<numbers.length; i++) {
			
			for(int j=0; j<numbers[i].length; j++) {
				sum+=numbers[i][j];
				System.out.println("The sum of all the integers = "+sum);
			}
		}
		
		System.out.println();
		sum=0;
		for(int r=0; r<numbers.length; r++) {
			for (int c=0; c<numbers[r].length; c++) {
				sum=sum+numbers[r][c];
				System.out.println("The sum of all the integers = "+sum);	
			}
		}
		
		}
		}
			
		
			
		
		
	


