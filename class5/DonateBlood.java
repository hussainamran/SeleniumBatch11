package com.syntax.class5;

public class DonateBlood {

	public static void main(String[] args) {
		/*In order to be eligible to donate your 
		 * blood you have to be 18 years old. 
		 * Also once you identify age eligibility 
		 * then we have to see if person matches weight
		 *  requirements. If person weight it more than 
		 *  110 lbs → then he/she is eligible, otherwise 
		 *  we cannot accept such a patient.
		 * 
		 */
		int age=18;
		int weight=10;
		if(age>=18 && weight>=110) {
			System.out.println(" you are eligible");
		}else {
			System.out.println(" you are not eligible");
			
		}
	}

}
