package com.ita.training.java.exceptions;

public class CompileTimeExceptionDemo {
	
	public static void main(String[] args) {
		try {
			sleep1(100);
		}
		catch (InterruptedException ex) {
			System.out.println("Interrupted Exception encountered.");
		}
		
		System.out.println("---End of Main Method---");
	}
	
	public static void sleep1(int ms) throws InterruptedException {
		Thread.sleep(ms);
	}

}


