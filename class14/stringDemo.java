package com.syntax.class14;

import java.util.Arrays;

public class stringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="Today is Tuesday. Today we have java class.";
		String[]strArr=str.split("[.]");
		//System.out.println(Arrays.toString(strArr));
		
		// Two way we can get string value
		
		for(String s:strArr) {
			System.out.println(s);
		}
	}

}
