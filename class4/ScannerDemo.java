package com.syntax.class4;

import java.util.Scanner;

public class ScannerDemo {

	// ctrl+shift+o auto import Scanner
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Abc";
		str="zyx";
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enert your name");
		String name=scan.next();
		System.out.println("Hello" +name);
		
		System.out.println(" Please enter you age");
		int age=scan.nextInt();
		
		System.out.println(name+ " you are "+age+" years old");
		
		
	}

}
