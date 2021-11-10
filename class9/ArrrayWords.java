package com.syntax.class9;

public class ArrrayWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words= {"Java", "Saturday", "day", "coding"," is"};
		
		for(int i=0;  i<words.length;i++) {
			System.out.println(words[i]);
			
		}
		
		
		int[] num= {100,200,300,400,500};
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		// to access all elements from an array we can use for each loop
		
		for(int n:num) {
			System.out.println(n);
		}
		
		String[] colors= {"red","blue","white"};
		
		for(String col:colors) {
			System.out.println(col);
		}
		
	}

}
