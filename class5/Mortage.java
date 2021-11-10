package com.syntax.class5;



public class Mortage {

	public static void main(String[] args) {
		/*Create a Java program and store values of mortgage rate and mortgage price.
		 *  First, program should check if rate is higher than 4.5 
		 *  user will not buy a house, otherwise user will 
		 *  consider buying. Once user decides to buy a house, 
		 *  if price of the house is larger than 200000 than 
		 *  user will take a loan, otherwise user will pay cash.
		 *  Create a Java program and call it a Donor.
		 * 
		 */
		
		
		double mortgage=300000;
		double rate=3;
		if(rate<=4.5) {
			System.out.println(" you can buy a house");
		 if(mortgage<200000) {
			System.out.println("you will pay cash");
		}else {
			System.out.println("You will take loan");
		}
		}else{
			System.out.println(" You do not buy house");
		

}}}
