package com.ita.training.java.exceptions;

import java.util.Scanner;

public class BankTransactions {
	public static void main(String[] args) {
		BankAccount a1=new BankAccount("Sanjib",5000);
		Scanner sc=new Scanner(System.in);
		int debit_amount=0;
		System.out.println("Enter the amount to withdraw");
		debit_amount=sc.nextInt();
		a1.debit(debit_amount);
		sc.close();
		
	}

}
