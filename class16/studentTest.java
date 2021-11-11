package com.syntax.class16;

public class studentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student obj=new student();
		
		obj.studentName="Amran";
		obj.studentID=78;
		obj.numberOfStudents ++;
		obj.universe();
		
		student obj1=new student();
		
		obj1.studentName="Farhad";
		obj1.studentID=67;
		obj1.numberOfStudents ++;
		obj1.universe();
		
		
		student obj2=new student();
		
		obj2.studentName="Alex";
		obj2.studentID=34;
		obj2.numberOfStudents ++;
		obj2.universe();
		
		System.out.println("Total number of students in batch 11 is "+obj2.numberOfStudents);
	
	}
	

}
