package com.syntax.class12;

public class Methods {
	
	int times;
	void sayHello() {
		System.out.println(" Hello batch 11");
		
		for(int i=0; i<5; i++) {
			System.out.println(" Hello batch 11");
		}
	}
	
	void sayHelloManyTimesWithstate() {
		for(int i=0; i<times; i++) {
			System.out.println(" Hello batch 11");
		}
	}
	void sayHelloManyTimesWithParameter(int times) {
		for(int i=0; i<times; i++) {
			System.out.println(" Hello batch 11");	
		}
	}

}
