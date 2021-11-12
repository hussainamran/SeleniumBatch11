package com.syntax.class15;

public class hWTesk1 {

	public static void main(String[] args) {
		
		/*Create a String that will hold a sentence. 
		 * Write a program to get a new String without any spaces.
		 * 
		 */
		
		String str="Today is Wednesday and we have java class";
		
		//string class we use when we don't chane a content of a veriable
		System.out.println(str.replace(" ",""));
		System.out.println(str);
		System.out.println();
		str=str.replaceAll("\\s", "");
		
		//string builder we use when we want to change content of value again and again
		StringBuilder str2=new StringBuilder("Today is Wednesday and we have java class");
		System.out.println(str2.reverse());
		System.out.println(str2);

	}

}
