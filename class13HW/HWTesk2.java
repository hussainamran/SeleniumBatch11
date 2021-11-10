package com.syntax.class13HW;

public class HWTesk2 {

	public static void main(String[] args) {
		
		/*Create a string and if the string is not empty perform the following. if the string has an
		 * odd number of caracters and has 3 or more characters print the character in the middle of the string 
		 */
		
		String str="hello";
		
		
		if(!str.isEmpty()&&str.length()%2!=0&&str.length()>=3) {
			System.out.println(str.charAt(str.length()/2));
		}

	}

}
