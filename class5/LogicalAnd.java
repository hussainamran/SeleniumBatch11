package com.syntax.class5;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		boolean understandJava=true;
		boolean enjoyJava=false;
		
		/*
		 * AND &&
		 * 
		 * true && true -->true
		 * true && false--> false
		 * false && true--> false
		 * false && false--> false
		 * 
		 * OR ||
		 * 
		 * true || true--> true
		 * true || false--> true
		 * false || true-->true
		 * false || false -->false
		 */
		
		
		if(understandJava && enjoyJava) {
			System.out.println(" That is awsome");
	}else {
		System.out.println(" You probbaly need to study more");
	}

		Scanner in=new Scanner(System.in);
		System.out.println(" Please enter any number");
		
		int num=in.nextInt();
		if(num<1) {
			System.out.println(" Number is 0 or negtive");
		}
		if(num>1 && num<=10) {
			System.out.println(num+" is small");
		}else if(num>11 && num<=100) {
			System.out.println(num+" is medium");
		}else if(num>101 && num<=1000) {
			System.out.println(num+" is large");	
		}else if(num>=1001){
			System.out.println(num+" is xlarge");
		}
}
}