package com.ita.training.java.strings;

public class StringMethods {

	//Array Declaration
	int marks[]= new int[6]; //integer array of size 6
	int [] subjects=new int[4]; //integer array of size 4
	 public static void main(String[] args) {
		//String[] names= {"A","B","C"};
		String str=" Hello this is my first program with String Manipulation. ";
		System.out.println("---Printing character at index 4.---");
		System.out.println(str.charAt(4));
		
		System.out.println("---Printing second occurrence of i.---");
		System.out.println(str.indexOf('i', str.indexOf('i')+1));
		
		System.out.println("---Printing all in UpperCase---");
		System.out.println(str.toUpperCase());
		
		System.out.println("---Splitting String into array.---");
		String[] string_list=str.split(" ");
		System.out.println(string_list.length);
		for(int i=0;i<string_list.length;i++) {
			System.out.println(string_list[i]);
		}	
		//Checking is it contains substring
		System.out.println(str.contains("first"));
		
		//Trim Method of string
		System.out.println(str.trim());
		
	}
}
