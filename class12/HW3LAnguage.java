package com.syntax.class12;

public class HW3LAnguage {

	void greeting(String country) {
		
		/*Create a method that will say Hello in different language based on the country that 
		 * will passed when method is executed.
		 * 
		 */
		
		String result=null;
		switch(country) {
		case "Mexcio":
			result="Ola";
			break;
		case "USA":
			result="Hello";
			break;
		case "France":
			result="Salut";
			break;
			default:
				result="Unknown";
			}
		System.out.println(result);
	
	}
	
	public static void main(String []arg) {
		
		 HW3LAnguage count=new  HW3LAnguage();
		 
		 count.greeting("Mexcio");
		 count.greeting("USA");
		 count.greeting("France");
	}

}
