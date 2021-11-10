package com.syntax.class15;

public class hWTesk2 {

	public static void main(String[] args) {
		
		/*Create a String that should be combination of letters, numbers and 
		 * special characters. 
		 * Find out how many alpha characters are there in the String.
		 * 
		 */
		
		String str="AHGHGHSkhsfhuehuh@#$$##$97845845854";
		
		String str2=str.replaceAll("", " ");
		System.out.println(str2.replaceAll("[^A-Za-z]", "").length());
			
		}
	}

