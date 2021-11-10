package com.syntax.class13;
import java.util.Arrays;
public class ArrayMethodTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// this how we see array elements
		
		ArrayMethod obj=new ArrayMethod();
		
		int[]array= {10,10,10,10,10};
		
		array=obj.doubleArray(array);
		System.out.println(Arrays.toString(array));

	}

}
