package com.syntax.class16;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee obj=new Employee();
		obj.emID=1;
		obj.salary="107000k";
		obj.ceo="Sumair";
		obj.benefit();
		
		System.out.println("***********");
		
		Employee obj1=new Employee();
		obj1.emID=10;
		obj1.salary="96000K";
		obj1.ceo="Sumair";
		obj1.benefit();
	}

}
