package com.syntax.class8;

public class HWClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//complete clock assignmen
		
		for(int i=0; i<=23; i++) {
			
			for(int j=0; j<=59; j++) {
				
				System.out.println("*********************************");
				
				if(i<10 && j<10) {
					System.out.println("0"+1+ ":"+"0"+j);
					
					System.out.println("*********************************");
					
				}else if(i>10 && j<10 ) {
					System.out.println(+1+ ":"+"0 "+j);
					
					System.out.println("*********************************");
					
				}else if(i<10 && j>10) {
					System.out.println("0"+1+ ": "+j);
					
					System.out.println("*********************************");
				}else
					System.out.println(i+ ":" +j);
				
				
			}
				
		}

	}
}

