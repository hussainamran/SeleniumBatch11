package com.syntax.class4;

public class MortageRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Create a Java program and store values of mortgage rate and mortgage price. 
		 * First, program should check if rate is higher than 4.5 user will not buy a house, otherwise user will consider buying. 
		 * Once user decides to buy a house, if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash.
		 * Create a Java program and call it a Donor.
		 */
		
		double rate=5.0;
		double homePrice=200000;
		
		if(rate==4.5) {
			System.out.println(" You can buy a house");
		}else {
			System.out.println(" You can not buy a house");
		}if(homePrice==100000) {
			System.out.println(" You can buy cash");
		}else {
			System.out.println(" You need a loan");
		}
	}

}
