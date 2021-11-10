package com.syntax.class15;

public class hWTesk5 {

	public static void main(String[] args) {
		
		/*
		 * How would you check if String is palindrome or not?

		 */
		
		String str="Iamhungry";
		
		String str2="";
		
		for(int i=str.length()-1;i>=0;i--) {
			str2+=str.charAt(i);
			
			if(str.equals(str2)) {
				System.out.println(str+ " is palindrome ");
			}else {
				System.out.println(str+ " is not palindrome");
			}
		}
		
		

	}

}
