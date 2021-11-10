package com.syntax.class9;

public class HwArrayAnimalsForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] Animals={"Lions","Tigers","Bear","Duck","Bird","Chicken"};
		for(String n:Animals) {
			for(int a=0; a<Animals.length; a++) {
				System.out.print(Animals[a]+" ");
			}
			System.out.println(n+" ");
		}

	}

}
