package com.ita.training.java.polymorphism_Overloading;

public class Addition {
	public static void main(String[] args) {
		
		Addition.add(5, 4);
		Addition.add("ABC"," XYZ");
		Addition.add(4.5,4);
		
	}
	
	//Add method for integers
	public static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	//Add method for String
	public static void add(String str1, String str2)
	{
		System.out.println(str1+str2);
	}
	
	//Add method for double
	public static void add(double a, double b)
	{
		System.out.println(a+b);
	}
	

}
