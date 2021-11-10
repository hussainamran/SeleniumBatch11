package com.syntax.class10;

import java.util.Scanner;

public class HWCarsScanner {

	public static void main(String[] args) {
		/*i want to create an array and store elements using scanner
		 * 
		 */

		Scanner in=new Scanner(System.in);
		System.out.println("Please enter how many elements you want to store inside array");
		
		int size=in.nextInt();
		//store elements inside an array of cars
		String[] cars=new String[size];
		 for(int i=0; i<cars.length; i++) {
			 System.out.println("Please enter your car");
			 cars[i]=in.next();
		 }
		
		 // retrieve all stored elements
		 
		 for(String car:cars) {
			 System.out.println(car+" ");
		 }
	}

}
