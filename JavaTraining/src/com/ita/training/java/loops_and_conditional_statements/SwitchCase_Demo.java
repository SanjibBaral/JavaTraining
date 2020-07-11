package com.ita.training.java.loops_and_conditional_statements;

import java.util.Scanner;

public class SwitchCase_Demo {
	//String Operations choices for user.
	static String[] choices= {"1. Reverse a String", "2. Replace 'a' wtih 's'.","3.Check Palindrome",
						"4. Reverse a word","5. Count no of occurrence of a given word",
						"6. Replace all special characters in a given string with '_'"};
	
	//Main Method
	public static void main(String[] args) {
		int key=0;
		StringBuffer str=new StringBuffer("Hello. How are you doing today?"); //Main String
		//String next_round=null;
		Scanner sc=new Scanner(System.in); //Get input from user for String Operation
		System.out.println("Your String is:\n"+str);
		System.out.println("!!!!!Please Enter the operation to be performed from following choice.!!!!!");
		String_Manipulation.print_StringArray(SwitchCase_Demo.choices);
		key=sc.nextInt();
		
		switch (key) {
			case 1:
				System.out.println("!!!!!!!Reversing the String.!!!!!!!!!");
				String_Manipulation.ReverseString(str);
				break;
			case 2:
				System.out.println("!!!!Replacing 'a' with 's'.!!!!!");
				String_Manipulation.replaceAwithS(str);
				break;
			case 3:
				System.out.println("Checking Palindrome. Please enter string");
				str=new StringBuffer(sc.next());
				String_Manipulation.checkPalindrome(str);
				break;
				
			case 5:
				String_Manipulation.OccurenceOfWord(str,"How");
				break;
				
			default:
				System.out.println("Invalid Key selected");
				break;
				
		}
		sc.close();
	}

}
