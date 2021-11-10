package com.syntax.class13HW;

public class HWTesk3 {

	public static void main(String[] args) {
		
		/*Create a String and print it in reverse order (Sunday → yadnuS).
		 * 
		 */

		String day="Sunday";
		StringBuilder input= new StringBuilder();
		input.append(day);
		input.reverse();
		System.out.println(input);
		
	}

}
