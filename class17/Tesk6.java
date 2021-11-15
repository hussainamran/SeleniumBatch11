package com.syntax.class17;

public class Tesk6 {

	/*Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
	Instance variables are being initialized
	Both Constructors are being executed
	 * 
	 */
	
	private String Title;
	private String Arthur;
	
	
	
	

	public Tesk6(String title) {
		super();
		Title = title;
	}





	public Tesk6(String title,String arthur) {
		this(title);
		Arthur = arthur;
	}





	public void printtitle() {
		System.out.println(Title+" "+Arthur);
	}
	
	
	
	
	
	
	
	
}
