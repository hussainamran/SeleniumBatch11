package com.syntax.class10;

public class HW42DArray {

	public static void main(String[] args) {
		
		/*Using 2D array create a grocery list.
		Inside you should have an array of veggies, fruits, dairy and sweets.
 		Retrieve all values from that array using 2 different loops
		 * 
		 */
		
		String[][] grocerys= {
				
				{"Tomato","pappers","coliflower","Avocado"},
				
				{"Apple","Orange","Mango"},
				
				{"cake","ice cream","choclate"},
				};
		
		for(String[] groc:grocerys) {
			
			for(String g:groc) {
				System.out.println(g);
			}
		}
		
		System.out.println("*************************");
		
		for(int i=0; i<grocerys.length; i++) {
			
			for(int j=0; j<grocerys[i].length; j++) {
				System.out.println(grocerys[i][j]);
			}
		}

}}
