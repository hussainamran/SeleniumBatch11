package com.syntax.class9;

public class ArrayTesk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] arr=new char[6];
		
		arr[0]='A';
		arr[1]='B';
		arr[2]='C';
		arr[3]='D';
		arr[4]='E';
		arr[5]='F';
		System.out.println(arr[1]);
		
		System.out.println("****************************");
		
		char[] gradearr= {'a', 'B','c','d'};
		
		System.out.println("element of grade 2 is "+gradearr[2]);
		
		System.out.println("****************************");
		
		String [] names= {"Amran", "hussain","Jabed","Azhar"};
		names[0]="delwar";
		System.out.println("After name change "+names[0]);
	}

}
