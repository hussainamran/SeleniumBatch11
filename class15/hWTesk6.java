package com.syntax.class15;

public class hWTesk6 {

	public static void main(String[] args) {
		
		/*How would you swap  2 strings without a temporary variable?
		 * 
		 */

		String a="good";
		String b="morning";
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a+" "+b);
	}

}
