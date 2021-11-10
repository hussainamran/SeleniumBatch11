package com.syntax.class9;

public class NastedLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boolean morning=true;
		for (int i=1; i<=3; i++) {
			
			System.out.println("I am for loop");
			
			while(morning) {
				System.out.println("good morning");
				break;
			}
			
		}
		System.out.println("*************************");
		
		for(int i=1; i<3; i++) {
			for(int j=1; j<=2; j++) {
				
				if(j==1) {
					continue;
					
				}
				System.out.println("I am for loop");
			}
			
				System.out.println("good morning");
		}
	}

}
