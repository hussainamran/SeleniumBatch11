package com.syntax.class10;

public class MoreArrayofChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] grades= {'A','B','C','D'};
		
		for(char grade:grades) {
			System.out.println(grade);
		}
		System.out.println("******************************");
		// Reverse
		
		for(int i=grades.length-1; i>=0; i--) {
			System.out.println(grades[i]+" ");
		}
		
		

	}

}
