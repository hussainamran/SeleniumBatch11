package com.syntax.class17;

public class ConstructorcarTeaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructorcar car=new Constructorcar("honda","Accord","sedan","black",2011,4,"Vej3434",140,200,true);
		car.printname();
		
		Constructorcar car2=new Constructorcar("honda");
		car2.printname();
		
		Constructorcar car3=new Constructorcar();
		car3.sayHello();
	}

}
