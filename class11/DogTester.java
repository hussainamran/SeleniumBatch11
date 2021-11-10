package com.syntax.class11;

public class DogTester {

	public static void main(String[] args) {
		
		Dog zemasDog= new Dog();
		
		zemasDog.name="Lexy";
		zemasDog.breed="American hound";
		zemasDog.color="Black";
		zemasDog.hight=2.5;
		zemasDog.age=10;
		zemasDog.gender='M';
		
		System.out.println("My dog name is "+zemasDog.name);
		System.out.println("His breed is "+zemasDog.breed);
		System.out.println("His color is "+zemasDog.color);
		
		Dog JimmaysDog=new Dog();
		JimmaysDog.name="Teddy";
		JimmaysDog.breed="Labrador Retriever";
		JimmaysDog.color="Golden";
		JimmaysDog.hight=5;
		JimmaysDog.age=5;
		JimmaysDog.gender='M';
		
		
		System.out.println("His breed is "+JimmaysDog.name);
		
		System.out.println("His breed is "+JimmaysDog.breed);
		System.out.println("His color is "+JimmaysDog.color);
		
		Dog arwasDog=new Dog();
		arwasDog.name="manroe";
		
		System.out.println("His breed is "+arwasDog.name);
		
		
		
		
		
	}

}
