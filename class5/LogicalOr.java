package com.syntax.class5;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
		 
		 System.out.println(" Do you have a credit card?");
		 String answer=in.next();
		 if(answer.equals("yes") && answer.equals("yep") && answer.equals("yeah")) {
		 
		 System.out.println(" Plese tell me the balance");
	}else {
		System.out.println(" Do you want to get a credit card");
	}
	System.out.print("end of the code");
	
	}
}

