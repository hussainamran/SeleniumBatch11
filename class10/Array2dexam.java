package com.syntax.class10;

public class Array2dexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] bigArray=new int[3][3];
		
		//adding elements inside 1 array or 1 row
		
		bigArray[0][0]=10;
		bigArray[0][1]=20;
		bigArray[0][2]=30;
		
		//adding elements inside 2 array or 1 row
		
		bigArray[1][0]=1;
		bigArray[1][1]=2;
		bigArray[1][2]=3;
		
	//adding elements inside 3 array or 1 row
		
		bigArray[2][0]=100;
		bigArray[2][1]=200;
		bigArray[2][2]=300;
		
		// how to access
		System.out.println(bigArray[2][1]);//200
		
		//what is shows?
		System.out.println("2D array size "+bigArray.length);//returns how many 1d arrays it has
		
		

	}

}
