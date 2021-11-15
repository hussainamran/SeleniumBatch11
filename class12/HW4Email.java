package com.syntax.class12;

public class HW4Email {
	/*Create a method createEmail(). Based on values of users name, lastName and 
	 * email type, your method should return complete email Address. Example:  
	 * createEmail(John, Snow, gmail) → johnsnow@gmail.com or 
	 * 
	 */
	
	String userName(String Fname, String Lname, String email) {
		return Fname+Lname+"@"+email;
	}
	
	public static void main(String[] args) {
		HW4Email obj=new HW4Email();
		System.out.println(obj.userName("amran", "hussain", "gmail"));

}
}