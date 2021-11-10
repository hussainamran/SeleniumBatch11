package com.syntax.class10;

public class HW22DArray {

	public static void main(String[] args) {
		/*Create a 2D array in which first array will consist of 4 names and second 
		 * array will contain grades. Then your program should print name of the 
		 * students that has A and B grade

		 * 
		 */
		
		String[][] grades= {
				
				{"John","Rob","Mike","Nick"},
				
				{"A","B","A","A"},
			
			};
		System.out.print(grades[0][0]+" "+grades[1][0]+","+" ");
		System.out.print(grades[0][1]+" "+grades[1][1]+","+" ");
		System.out.print(grades[0][2]+" "+grades[1][2]+","+" ");
		System.out.print(grades[0][3]+" "+grades[1][3]+"."+" ");


	}

}
