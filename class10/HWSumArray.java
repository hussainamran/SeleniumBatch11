package com.syntax.class10;

public class HWSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int [] numbers= {12,23,34,45,67,78};
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]+" ");
			//sum+=numbers[i];

		}
		System.out.println("The Sum of all the integers = "+sum);
		
		sum=0;
		for(int num:numbers) {
			sum+=num;
		}
		System.out.println("The Sum of all the integers = "+sum);
	}

}
