package com.ita.training.java.variables;

public class VariableDemo {
	int intAge;
	String strName;
	double dbHeight=5.7;
	//static String strCountry="NEPAL"; 
	//Static variable will be stored only on one location for all objects created. All objects will share this variable.
	String strCountry="NEPAL";
	public static void main(String[] args) {
		print_intAge();
		print_dbHeight();
		print_strName();
		//System.out.println(strCountry);
		
	}
	
	public static void print_intAge(){
		VariableDemo person= new VariableDemo();
		person.strName="SanjibBaral";
		System.out.println(person.intAge);
		System.out.println(person.strCountry);
	}
	
	public static void print_strName() {
		VariableDemo person= new VariableDemo();
		person.intAge=32;
		person.strName="SanjibBaral";
		System.out.println(person.strName);
		System.out.println(person.strCountry);
	}
	
	public static void print_dbHeight() {
		VariableDemo person = new VariableDemo();
		person.strName="Sanjib";
		person.dbHeight=6;
		person.strCountry="nepal";
		System.out.println(person.strCountry);
		System.out.println(person.dbHeight);
	}
}
