package com.syntax.class15;

public class hWTesk4 {

	public static void main(String[] args) {
		
		/*How would you reverse a String character by character?
		 * 
		 */
		String str="Hello how are you";
		String[] strArr=str.split(" ");
		
		for(String word:strArr) {
			StringBuilder stringbuilder=new StringBuilder(word);
			System.out.print(stringbuilder.reverse()+" ");
		}
	}

}
