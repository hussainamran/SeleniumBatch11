package com.syntax.class12;

/*Create  class Student that will have a method getGrade. Your method should accept
 *  the score of a student and return a grade:
 * 
 */

public class HW6Grade {
	
	 char getgrade(int score) {
		
		if(score>=90) {
		return 'A';
		}else if(score>=80) {
			return 'B';
		}else if(score>=70) {
			return 'C';
		}else if(score>=50) {
			return 'D';
		}else {
			return 'F';
		}
		
		
		}
	 
	 public static void main(String []arg) {
		 
		 HW6Grade inp=new HW6Grade();
		 System.out.println(inp.getgrade(9));
		 
	 }
	}


