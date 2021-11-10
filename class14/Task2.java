package com.syntax.class14;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String fatherName="Daniel";
		String motherName="Mary";
		String isBoyGirl="boy";
		
		if(isBoyGirl.equalsIgnoreCase("girl")) {
		String firstPart=fatherName.substring(0, fatherName.length()/2);
		String secondPart=motherName.substring(motherName.length()/2);
		System.out.println(firstPart+secondPart);
	}else {
		String firstPart=motherName.substring(0, fatherName.length()/2);
		String secondPart=fatherName.substring( motherName.length()/2);
		System.out.println(firstPart+secondPart);

	}

}
}