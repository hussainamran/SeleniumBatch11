package com.syntax.class10;

public class Array2DGetSpecficIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String [][] groceries= {
				
				{"banana","apple","orange"},
				
				{"potato","olives"},
				
				{"milk","yogurt","cheese","sourcream"},
				
		};
		
		// To get specfic array 
			for(int i=0; i<groceries.length; i++) {
			
			for(int j=0; j<groceries[i].length; j++ ) {
				
		
		String element=(groceries[i][j]);
		System.out.println(element);
		
		if(element.equals("sourcream")) {
			System.out.println(i+" "+j);
			
			for(String [] grocery:groceries) {
				
				for(String g:grocery) {
					System.out.println(g);
				}
			}
		}

	}

}}}
