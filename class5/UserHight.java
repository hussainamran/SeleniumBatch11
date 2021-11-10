package com.syntax.class5;

import java.util.Scanner;

public class UserHight {

	public static void main(String[] args) {
		 
		/*Prompt the user to enter person heights in inches. 
		 * Person should be classified as one of the following:
		short (under 60 inch)
		medium(between 60 -72 inch)
		tall (over 72 inch)
		 * 
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println(" Enter person your heght in inches");
		int h=input.nextInt();
		
		if(h<60) {
			System.out.println(" Short");	
		}else if(h>60 && h<72) {
			System.out.println("med");
		}else {
			System.out.println("tall");
		}
	}

}
