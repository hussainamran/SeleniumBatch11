package com.syntax.class13;

public class StringDemoMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Split sentence method
		
		
		String str="This is Batch 11. Bathch 11 is gtreat";
		String []arr=str.split("[.] ");
		
		//System.out.println(arr[0]);
		
		for(String word:arr){
			System.out.println(word);
		}
		

	}

}
