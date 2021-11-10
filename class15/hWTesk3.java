package com.syntax.class15;
import java.util.Arrays;

public class hWTesk3 {

	public static void main(String[]arg) {
		
		/*You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
		 *  How would you find out how many sentences are in that String?
		 * 
		 */
		
		String str="Is it saturday? Is it reining? Do we have a java class today?";
		
		System.out.println(str.split("[?]").length);
	}

}
