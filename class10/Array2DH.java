package com.syntax.class10;

public class Array2DH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] numbers= {
				
				{100, 200,300},
				
				{0,9,8},
		};
		
		System.out.println("size of the array = "+numbers.length);
		System.out.println(numbers[1][1]);
		
		// to get all the elements using regular for loop
		
		for(int i=0; i < numbers.length; i++) {
			
			for(int j=0; j<numbers[i].length; j++) {
				
				int element=numbers[i][j];
				System.out.println(element+" ");
				
				//another way use forLoop get elements
				
			
			}
			
		}
		
		for(int[] num:numbers) {
			for(int n:num) {
				System.out.println(n);
			}
		}

	}

}
