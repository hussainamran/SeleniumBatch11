package com.syntax.class13;



public class ClassAssigment {
	
	public static void main(String []arg){

	String username="Amran";
	String password="pass123";
	String confirmpassword="pass1236";
	
	//to check if user name is empty leave value empty user not equail sign 
	
	if(!username.isEmpty()||password.isEmpty()) {
		if(password.length()>=8) {
			if(!password.equals("username")) {
				if(password.equalsIgnoreCase(confirmpassword)) {
					System.out.println("Your username and password has been created");
				}else {
					System.out.println("Password do not match");
				}
			}else {
				System.out.println("Password cannot contain username");
			}
			
			
		}else {
			System.out.println("Password is too short");
		}
		
	}else {
		System.out.println("Username and password cannot be empty");
	}
	
	
	}
}

