package com.ita.training.java.access_modifiers;

public class Square extends Geometry{
	//It is required to define the abstract methods from abstract class.
	public void perimeter() {
		System.out.println("Square perimeter");
	}
	
	public void area() {
		System.out.println("Square area");
	}
	public static void main(String[] args) {
		Square sq1=new Square();
		sq1.perimeter();
		sq1.area();
	}

}
