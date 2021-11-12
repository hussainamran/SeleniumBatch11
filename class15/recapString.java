package com.syntax.class15;

public class recapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="This is Lubo. Lubo is break manger.";
		
		System.out.println(str.replace("Lubo", "sorbon"));
		System.out.println(str.replaceAll("Lubo", "sorbon"));
		
		String str2="jfdhjgknkj45y436y7#$%^##$";
		System.out.println(str2.replaceAll("[^A-za-z0-9]", ""));// what ever you want print we store inside bracket 
		
		String str3="";
		for(int i=0;i<5; i++) {
			str3=str3+i;
		}
		System.out.println(str3);
		
	}
	
}

