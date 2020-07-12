package com.ita.training.java.exceptions;

public class BankAccount {
	public String name;
	public int balance=0;
	
	public BankAccount() {
		this.name="Default_name";
	}
	
	public BankAccount(String name,int balance) {
		this.name=name;
		this.balance=balance;
	}
	
	public void debit(int amount) {
		int tempbalance=this.balance-amount;
		if (tempbalance<0) {
			try {
				throw new InsufficientBalance();	
			}
			catch (InsufficientBalance e) {
				System.out.println("Insufficient Balance Exception Handled.");
			}
		}
		else{
			this.balance=this.balance-amount;
			System.out.println("Your new balance is $"+this.balance);
			System.out.println("Thank you for your business.");
			}
			
		
		
	}

}
