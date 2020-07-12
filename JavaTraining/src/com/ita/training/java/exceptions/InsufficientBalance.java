package com.ita.training.java.exceptions;

public class InsufficientBalance extends Exception {
	
	public InsufficientBalance() {
		System.out.println("There is not enough balance.");
	}
	
	public InsufficientBalance(long balance) {
		System.out.println("Your request exceeds your current balance of $"+balance);
	}
}
