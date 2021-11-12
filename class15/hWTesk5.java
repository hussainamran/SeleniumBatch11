package com.syntax.class15;

public class hWTesk5 {

	public static void main(String[] args) {
		
		/*
		 * How would you check if String is palindrome or not?

		 */
		
		String str="Iamhungry";
		
		StringBuilder strB=new StringBuilder(str);
		strB.reverse();
		if(str.equals(strB.toString())) {
			System.out.println(str+ " is polindrome");
		}else {
			System.out.println(str+ " Not is palindrom");
		}
		
		

	}

}
