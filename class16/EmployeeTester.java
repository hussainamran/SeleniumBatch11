package com.syntax.class16;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee obj=new Employee();
		obj.emID="123";
		obj.salary=107000;
		
		
		
		System.out.println("***********");
		
		Employee obj1=new Employee();
		obj1.emID="10";
		obj1.salary=96000;
		
		
		System.out.println(obj.emID);
		System.out.println(obj.salary);
		System.out.println(obj1.emID);
		System.out.println(obj1.salary);
		System.out.println(Employee.ceo);
	}

}
