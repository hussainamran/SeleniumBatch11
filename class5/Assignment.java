package com.syntax.class5;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		/*Write a program that will ask user to input the current 
		 * time (use 24 hour format)
		 * if hour between 1-11 --> morning
		 * if hour between 12-15--> afternoon
		 * if hour between 16-20-->eveing
		 * if hour between 21-24-->night
		 */
		
		Scanner in=new Scanner(System.in);
		System.out.println(" Please enter current time");
		int time=in.nextInt();
		
		if(time>=1  && time<=11) {
			System.out.println(" Right now moring");
		}else if(time>=12 && time<=15) {
			System.out.println(" Right now is agternoon");
		}else if(time>16 && time<=20) {
			System.out.println("ight now is evening");
		}else if(time>=21 && time<=24) {
			System.out.println("ight now is night");
		}else {
			System.out.println(" Not vaild time entered");
		}
	}

}
