package com.syntax.class13;

public class ArrayMethod {
	
	int [] doubleArray(int[]arr) {
		
		// enhence for loo use to access the elememts for(int number:arr){
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=arr[i]*2;
		}
		return arr;
		
		
	}

}
