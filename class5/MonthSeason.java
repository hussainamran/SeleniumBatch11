package com.syntax.class5;

import java.util.Scanner;

public class MonthSeason {

	public static void main(String[] args) {
		/*Write a program for user to enter his/hers 
		 * birth month.Based on the month define the season.
		Example: if user is born in June, July or 
		August → season =“Summer”.
		At the end of the program we should see output as 
		“You were born is season ______“.
		 * 
		 */
		
		Scanner in=new Scanner(System.in);
		System.out.println(" Enter the season which you were born?");
		String month=in.next();
		String season=null;
		
		if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("Fabuary")) {
			season="winter";
		}else if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("april") || month.equalsIgnoreCase("May")) {
			season="Spring";
		}else if(month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			season="Summer";
		}else if(month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			season="fall";
		}
		System.out.println("You were born is season "+season);
		}
			}
	


