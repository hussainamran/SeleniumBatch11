package com.syntax.class10;

public class HW32DArray {

	public static void main(String[] args) {
		/*Create 2D array of cars : american, german, korean, italian. 
		 * Then retrieve all values from that array using 2 different loops
		 * 
		 */
		
		String[][] cars= {
				
				{"American","German","Korean","Italian"},
				
					
		};
		for(String[] model:cars) {
			for(String m:model) {
				System.out.println(m);
			}

			
		}
		
		System.out.println("************************");
		
		for(int i=0; i<cars.length; i++) {
			
			for(int j=0; j<cars[i].length; j++) {
				System.out.println(cars[i][j]);
			}
				
			}
	
		}

	}


