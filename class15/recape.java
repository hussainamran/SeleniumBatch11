package com.syntax.class15;

public class recape {

	public static void main(String[] args) {
		
		StringBuilder stringBuilder=new StringBuilder();
		for(int i=0; i<5; i++) {
			stringBuilder.append(i);
		}
		System.out.println(stringBuilder);
		
		String str4="Me: Look it's not you it's me, walking away";
		
		StringBuilder strBuilder=new StringBuilder(str4);
		strBuilder.reverse();
		System.out.println(strBuilder);
		
		
		

	}

}
