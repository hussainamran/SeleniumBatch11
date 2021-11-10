package com.syntax.class15;

public class hWTesk4 {

	public static void main(String[] args) {
		
		/*How would you reverse a String character by character?
		 * 
		 */
		String str="Hello how are you?";
		String str2="";
		for(int i=str.length()-1; i>=0; i--) {
			str2+=str.charAt(i);
		}
		System.out.println(str2);
	}

}
