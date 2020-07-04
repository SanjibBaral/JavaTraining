package com.ita.training.java.access_modifiers;

class Person {
	String str_name;
	int int_age;
	static int int_count=0;
	final static String str_planet="Earth";
	
	//Default Constructor
	Person()
	{
		System.out.println("Default Construction");
		++int_count;
	}
	//Parameterized Constructor
	Person(String str,int age)
	{
		this.str_name=str;
		this.int_age=age;
		++int_count;
	}
	
	//Overriding toString() method used by print statement.
	public String toString() {
		String str=null;
		str="Person Name: "+this.str_name+"\nAge: "+this.int_age;
		return str;
	}
	
	static void ObjectCount() {
		System.out.println("No. of Person Object Created = " +Person.int_count);
	}
}

/**
 * 
 * @author sanji
 *Only One public class can exist in a file and this class name must match with filename.
 *Only public class must contain the main file.
 */
public class Employee {
	public static void main(String[] args) {
		//System.out.println(Person.str_planet);
		Person p1=new Person();
		p1.str_name="Sanjib";
		p1.int_age=32;
		System.out.println(Person.str_planet);
		
		System.out.println("----------Print P1-------------");
		System.out.println(p1);
		
		System.out.println("----------Print P2-------------");
		Person p2= new Person("Sanjib Baral",31);
		System.out.println(p2);
		
		System.out.println("----------Print P1-------------");
		System.out.println(p1);
		
		//Accessing static method
		Person.ObjectCount();
		
		//Accessing static variable
		System.out.println("Printing Object Count without method:"+(Person.int_count));
	}
}
