package com.syntax.class10;

public class HW12DArray {

	public static void main(String[] args) {
		/*Create a 2D array where you will store the following values:
		 *  Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama. 
		 *  After storing values print the following String:
		 */
		
		String[][] names= {
				
				{"Mr","Mrs","Ms","Miss"},
				
				{"smith","jorden","jackson","Obama"},
				
				
				
				
		};
		System.out.print(names[0][1]+" "+ names[1][0]+","+" ");
		System.out.print(names[0][0]+" "+ names[1][3]+","+" ");
		System.out.print(names[0][2]+" "+ names[1][2]+","+" ");
		System.out.print(names[0][3]+" "+ names[1][1]+"."+" ");
		
		

	}

}
