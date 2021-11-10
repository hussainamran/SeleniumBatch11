package com.syntax.class12;

public class Methods1 {
	
	void repeatWords(String word, int times) {
		for(int i=0; i<times; i++) {
			System.out.println(word);
		}
	}
	
	void isItRaning(boolean isRain) {
		if(isRain) {
			System.out.println("Please take Umbrella");
		}else {
			System.out.println("Lets go for a walk");
		}
	}

}
