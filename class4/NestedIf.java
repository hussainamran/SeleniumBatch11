package com.syntax.class4;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean vaccine=true;
		int does=2;
		if (vaccine) {
		System.out.println("How many dose have taken");
		if (does==1) {
			System.out.println("When are you taken 2nd dose");
		}else {
			System.out.println("You are fully vaccinated");
		}
		}
		System.out.println("-----------------------------------");
		String day="Monday";
		int date=14;
		int time=12;
		if(day.equals("Friday")) {
			System.out.println("I am going to the movie today");
			
			if(date==13) {
				System.out.println("I am watching a scary movie");
			}else {
				System.out.println("I am watching a comedy today");
			}
		}else {
			System.out.println("I am going to study");
			if(time>23) {
				System.out.println("i have to go sleep cause i have class");
				
			}
		}
	}

}
