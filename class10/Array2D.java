package com.syntax.class10;

import javax.lang.model.util.Elements;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// let's create an 2d array of groceries
		
		String [][] groceries= {
				
				{"banana","apple","orange"},
				
				{"potato","olives"},
				
				{"milk","yogurt","cheese","sourcream"},
				
		};
		System.out.println(groceries.length);
		
		
		
		System.out.println(groceries[2][1]);//yogurt
		
		
		System.out.println("# of elements inside array with indesx 0 ="+groceries[0].length);
		System.out.println("# of elements inside array with indesx 1 ="+groceries[1].length);
		System.out.println("# of elements inside array with indesx 2 ="+groceries[2].length);
		
		int sum=0;
		
		// how to get all elements from 2D Array?
		
		for(int i=0; i<groceries.length; i++) {
			
			for(int j=0; j<groceries[i].length; j++ ) {
				
				
				System.out.println(groceries[i][j]);
				sum++;
				
				System.out.println("# of emelemts inside 2D array is = "+sum);
				
				
				System.out.println("*********************");
				
				
			}
		}

	}

}
