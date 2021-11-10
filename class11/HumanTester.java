package com.syntax.class11;

import java.util.Scanner;

public class HumanTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human tamana=new Human();
		 tamana.name="Tamana";
		 tamana.age=16;
		 tamana.hight=5.8;
		 tamana.bloodType="A+";
		 
		 tamana.eat();
		 tamana.sleep();
		 tamana.walk();
		 
		 System.out.println("************************");
		 
		 Human Amran=new Human();
		 Amran.name="Amran";
		 Amran.age=18;
		 Amran.hight=5.9;
		 Amran.weight=100;
		 Amran.bloodType="A";
		 
		 Amran.eat();
		 Amran.sleep();
		 Amran.walk();
		 Amran.sendMemes();
		 
		 Scanner in=new Scanner(System.in);
	}

}
