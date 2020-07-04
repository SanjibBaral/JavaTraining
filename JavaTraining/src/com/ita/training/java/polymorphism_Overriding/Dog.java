package com.ita.training.java.polymorphism_Overriding;

public class Dog extends Animal{
	public static void main(String[] args) {
		Dog d1=new Dog();
		Animal a1 = new Animal();
		System.out.println("-----------Dog Object---------");
		d1.whoAmI();
		d1.mySuperClass();
		
		System.out.println("---------Animal Object--------");
		a1.whoAmI();
		a1.mySuperClass();
	}
	
	//Overriding method from Animal.
	void whoAmI() {
		System.out.println("I am a dog.");
	}
	
}
