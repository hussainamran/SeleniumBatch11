package com.syntax.class14;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// deleting string 
		String str="AHFynjdnfk45786709#$#jfkj87*&";
		System.out.println(str.replaceAll("[0-5]", "*"));//print after 5 from anynumber
		System.out.println(str.replaceAll("[a-z]", "*"));// do not print anything start with smaller a-z
		System.out.println(str.replaceAll("[A-Z]", "*"));
		System.out.println(str.replaceAll("[A-Za-z]", "*"));
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", "*"));// removing all simbul
		System.out.println(str.replaceAll("[$%]", "*"));
		System.out.println(str.replaceAll("[$%aZ]", "*"));
	}

}
