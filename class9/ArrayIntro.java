package com.syntax.class9;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0;
		System.out.println(num);
		
		int[] array=new int[4];
		array[0]=12;
		array[1]=10;
		array[2]=13;
		array[3]=14;
		System.out.println(array[2]);
		
		
		double[]arr=new double[3];// storning 3 elements inside an array that we named arr
		arr[0]=11.99;
		arr[1]=11.00;
		arr[2]=11.19;
		
		//can i replace value from an array?
		
		arr[1]=100.99;
		System.out.println("After changing value of an element "+arr[1]);
		
		
		String[] colors=new String[4];
		
		colors[0]="red";
		colors[1]="black";
		colors[2]="yellow";
		colors[3]="green";
		
		// see how many elements inside array/ what is the size of an array
	}
	

}
