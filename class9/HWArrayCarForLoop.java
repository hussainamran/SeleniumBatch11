package com.syntax.class9;

public class HWArrayCarForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cars= {"Toyata","honda","ford","Bmw","Lexus","Jaguar"};
		
		for(String n:cars) {
			for(int c=0; c<cars.length; c++) {
				System.out.print(cars[c]+" ");
			}
			System.out.println(n+" ");
		}

	}

}
