package com.syntax.class12;

public class Phone {
	
	
	String phonemodel;
	String Phonecolor;
	int screensize;
	
	String phonetype;
	String operatingsystem;
	int GB;
	
	String phonebrend;
	String Gsm;
	String camera;
	
	void type() {
		System.out.println("What type of phoe is?");
	}
	void oper() {
		System.out.println("What type of operating system this phone has?");
	}
	void storage() {
		System.out.println("What is the Gb?");
	}
	void breand() {
		System.out.println("What type of phone do you have?");
	}
	void outside() {
		System.out.println("Can i use this phone anywhere in the world?");
	}
	void picture() {
		System.out.println("How many Mgpixel");
	}
	
	void turnon() {
		System.out.println("Turn phone power On");
	}
	void pressonnumber() {
		System.out.println("Press in number on the screen");
	}
	void turnoff() {
		System.out.println("Turn phone power off");
	}
	
	public static void main(String []agr) {
		
		Phone smart=new Phone();
		smart.phonemodel="iphone13";
		smart.Phonecolor="Blue";
		smart.screensize=5;
		
		smart.phonetype="glasky";
		smart.operatingsystem="Android";
		smart.GB=16;
		
		smart.phonebrend="Nokia";
		smart.Gsm="Internatiol";
		smart.camera="astonishing";
		
		System.out.println();
		System.out.println("My phone is "+smart.phonemodel);
		System.out.println("My phoe is "+smart.Phonecolor);
		System.out.println("My phone screen size is "+smart.screensize);
		
		System.out.println();
		System.out.println("My phone is "+smart.phonetype);
		System.out.println("My phoe is international use able "+smart.Gsm);
		System.out.println("My phone memory size is "+smart.GB);
		
		System.out.println();
		System.out.println("My phone is "+smart.phonebrend);
		System.out.println("My phoe operating system is "+smart.operatingsystem);
		System.out.println("My phone camera is "+smart.camera);
		
		
		
	}
	
	
}
