package com.syntax.class14;

import java.util.Arrays;

public class mthodsOfJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Amran";
		System.out.println(name.length());
		System.out.println(name.startsWith("A"));
		System.out.println(name.endsWith("n"));
		System.out.println(name.contains("l"));
		System.out.println(name.equals("Amran"));
		System.out.println(name.equalsIgnoreCase("Amran"));
		System.out.println(name.charAt(5));
		System.out.println(name.indexOf("r", 4));
		System.out.println(name.substring(3));
		System.out.println();
		System.out.println(name.substring(3,5));
		System.out.println(name.isEmpty());
		System.out.println(name.trim());
		String sentence="This is a java class";
		System.out.println(Arrays.toString(sentence.split(" ")));// to get all the string from an array
		System.out.println(sentence.split(" ")[1]);
	}

}
