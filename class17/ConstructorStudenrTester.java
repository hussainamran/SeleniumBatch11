package com.syntax.class17;

public class ConstructorStudenrTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorStudenr stud=new ConstructorStudenr("Alex",98,98,98);
		stud.printavggrade();
		
		new ConstructorStudenr("Amran",99,99,99).printavggrade();
		new ConstructorStudenr("azhar",98,78,86).printavggrade();
		new ConstructorStudenr("Jabed",90,78,98).printavggrade();
	}

}
