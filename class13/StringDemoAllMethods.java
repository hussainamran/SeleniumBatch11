package com.syntax.class13;

public class StringDemoAllMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//We can not use string null value to another string value using concat method
		String name=new String("Amarn");// this way to create object class
		String name1="Rima";// this also anoter way to create object
	
		
		System.out.println(name.length());// this method find caracter letters of Amran
		System.out.println(name1.length());// this method find carcter for rima
		
		
		System.out.println(name1.toLowerCase());
		System.out.println(name1.toUpperCase());
		System.out.println();
		
		String str="This is easy 123456 ^%$&";
		System.out.println(str.toLowerCase());
		
		System.out.println(name.concat(name1));// not recommanded to use always// 
		System.out.println();
		
		String name3="";
		System.out.println(name3.isEmpty());
		
		name3="Silva";
		System.out.println(name3.isEmpty());
		//System.out.println(name3.isBlank());
		System.out.println();
		
		String str1="            Batch 11 is ......      ";
		System.out.println(str1.trim());
		System.out.println();
		
		String str2="This is a easy class";// this method we check string start with 
		System.out.println(str2.toLowerCase().startsWith("t"));
		System.out.println(str2.startsWith("This"));
		System.out.println(str2.startsWith("L"));
		System.out.println(str2.startsWith("easy"));
		System.out.println(str2.endsWith("s"));// string end with character
		System.out.println();
		
		String name4="This class is eassy";// we use this mathod to check if we have the string which we mention in parameter
		System.out.println(name4.contains("class"));
		System.out.println(name4.contains("lemon"));
		System.out.println(name4.contains("i"));
		System.out.println();
		
		String str3="Hello";// to check value same or not
		String str4="hellodfgfg";
		System.out.println(str3.equals(str));
		System.out.println(str3.equalsIgnoreCase(str4));
		System.out.println();
		
		System.out.println(str3.charAt(2));//
		
		System.out.println(str3.toUpperCase().charAt(4));
		System.out.println(str4.indexOf('l', str4.indexOf('l')+1));
		System.out.println();
		
		System.out.println(name4.substring(5));// bigger string ingnoring some character
		System.out.println(name4.substring(5,11));
		
		
		
	}

}
