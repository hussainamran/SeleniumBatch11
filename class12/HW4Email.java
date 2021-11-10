package com.syntax.class12;

public class HW4Email {
	/*Create a method createEmail(). Based on values of users name, lastName and 
	 * email type, your method should return complete email Address. Example:  
	 * createEmail(John, Snow, gmail) → johnsnow@gmail.com or 
	 * 
	 */
	
	 String createEmail(String username, String lastName, String emailtype) {
		 
		
		return username+lastName+"@"+emailtype+".com"; 
		
	}
	 
	 public static void main(String []arg) {
		 HW4Email inp=new  HW4Email ();
		 System.out.println(inp.createEmail("Ron", "Shake", "gmail"));
	 }

}
