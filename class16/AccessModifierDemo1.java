package com.syntax.class16;

public class AccessModifierDemo1 {
	
	private String name;
	int age;
	public double salary;
	
	private void displayName() {
		System.out.println(name);
	}
	void displayAge() {
		System.out.println(age);
	}
	public void displaySalary() {
		System.out.println(salary);
	}
	
	public static void main(String [] args) {
		AccessModifierDemo1 am=new AccessModifierDemo1();
		am.name="Nabil";
		am.age=22;
		am.salary=120000;
		am.displayName();
		am.displayAge();
		am.displaySalary();
		
	}

}
