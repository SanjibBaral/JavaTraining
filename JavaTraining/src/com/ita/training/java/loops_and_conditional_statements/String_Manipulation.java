package com.ita.training.java.loops_and_conditional_statements;
/*
 * Defining Different Methods for processing or manipulating Strings.
 */
public class String_Manipulation {
	
	/*
	 * Method to print each item of String Array in a separate line
	 * Input: String Array
	 * Output: Void
	 */
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("Hello . How are you doing today?"); 
		StringBuffer word=new StringBuffer("Hello");
		ReverseAWord(str, word);
	}
	
	public static void print_StringArray(String[] str)
	{
		for (String str_value : str) {
			System.out.println(str_value);
			}
	}
	
	/*
	 * Printing String in Reverse Order without use of a String Method.
	 * Input: String
	 */
	public static String ReverseString(StringBuffer str) {
		System.out.println("ReverseString Function Entered.");
		String reverse_str=new String();
		int string_length=str.length();
		for(int i=string_length-1;i>=0;i--)
		{
			reverse_str=reverse_str.concat(str.substring(i, i+1));
		}
		System.out.println(reverse_str);
		return reverse_str;
	}
	
	/*
	 * Method to replace all 'a' with 's'.
	 * Input: String
	 */
	
	public static void replaceAwithS(StringBuffer str) {
		System.out.println("Replacing 'a' with 's' in string.");
		//Only String has replaceAll() method
		System.out.println(str.toString().replaceAll("a","s"));
		}

	/*
	 * Method to check if a string is Palindrome.
	 */
	public static void checkPalindrome(StringBuffer str) {
		String reverse_str=null;
		reverse_str=ReverseString(str);
		if(str.toString().equals(reverse_str)) {
			System.out.println("String is Palindrome.");
		}
		else {
			System.out.println("String is not Palindrome.");
		}
	}
	
	public static void ReverseAWord(StringBuffer str, StringBuffer word) {
		String[] str_array= str.toString().split(" ");
		String final_str=new String();
		for (String str1 : str_array) {
			if(str1.equals(word.toString())) {
				final_str=final_str+String_Manipulation.ReverseString(word)+" ";
			}
			else {
				final_str=final_str+str1+" ";
			}
		}
		System.out.println(final_str);
		
	}
	
	/**
	 * Method to count the occurence of a word in a given string.
	 */
	public static void OccurenceOfWord(StringBuffer str,String word) {
		int start_index=0,count=0;
		//int word_length=word.length();
		while(str.indexOf(word, start_index)!=-1) {
			start_index=str.indexOf(word, start_index)+1;
			count++;
		}
		System.out.println("There are "+count+" occurrences of "+word);
		
	}
}
