package com.syntax.class5;

import java.util.Scanner;

public class DMV {

	public static void main(String[] args) {
		/*You are DMV representative and you need to 
		 * ask customer their age. If they are 18 and 
		 * older you will issue a driver license to 
		 * them, otherwise you will offer them to get 
		 * a learners permit.
		 * 
		 */
 Scanner in=new Scanner(System.in);
 System.out.println(" Enter your age");
 int age=in.nextInt();
 if(age>=18) {
	 System.out.println(" We will issue a lincense");
 }else {
	 System.out.println(" We will offer a learners permit");
 }
	}

}
