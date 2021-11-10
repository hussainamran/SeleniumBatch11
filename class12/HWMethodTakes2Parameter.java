package com.syntax.class12;

public class HWMethodTakes2Parameter {
	/*Create a method that will take 2 parameters as a numbers and prints which 
	 * number is larger.
	 * 
	 * 
	 */


	void findlargest(int num1, int num2) {
		
		if(num1>num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
	}
	
	public static void main(String []arg) {
		
	 HWMethodTakes2Parameter obj=new  HWMethodTakes2Parameter();
	 obj.findlargest(12, 23);

	 
	}
}
	


	
	
	
	
	


