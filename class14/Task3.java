package com.syntax.class14;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Create a String and print it in reverse order (Sunday → yadnuS).
		 * 
		 */


		
		String str="Sunday";
		
		String newStr="";
		
		for(int i=str.length()-1;i>0;i--) {
			newStr+=str.charAt(i);
		}
		System.out.println(newStr);
	}

}
