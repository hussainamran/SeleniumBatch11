package com.syntax.class5;

import java.util.Scanner;

public class QuizMedFinal {

	public static void main(String[] args) {
		/*Write a program that will read 
		 * three inputs of scores 
		 * (quiz, mid term, and final scores) 
		 * and determine the grade based on the following rules: 
		 * if the average score >=90 → grade=A
			if the average score >= 70 and <90 → grade=B
			if the average score>=50 and <70 → grade=C
			if the average score<50 → grade=F
		 */
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your quiz score");
		int quiz=in.nextInt();
		System.out.println("Enter your medterm score");
		int midterm=in.nextInt();
		System.out.println("Enter your finalterm score");
		int finalterm=in.nextInt();
		String grade=null;
		if(quiz+midterm+finalterm>=90) {
			grade="A";
		}else if(quiz+midterm+finalterm>=70 && quiz+midterm+finalterm<90) {
			grade="B";
		}else if(quiz+midterm+finalterm>=50 && quiz+midterm+finalterm<70) {
			grade="C";
		}else if(quiz+midterm+finalterm<50) {
			grade="F";
		}
				System.out.println("quiz "+quiz+ " midterm "+midterm+ " finalterm " +finalterm+grade);
			}
		}

	


