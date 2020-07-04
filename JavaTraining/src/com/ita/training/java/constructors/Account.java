package com.ita.training.java.constructors;

public class Account {
	String str_name;
	double db_phone;
	int int_age;
	
	//Static Initialization Block
	static {
		System.out.println("\n********Static Initialization Block executed.*******\n");
	}
	
	//Default Constructor
	Account(){
		super();
		System.out.println("-------Default Constructor Called.--------");
	}
	
	//Parameterized Constructor
	Account(String name,double phone,int age){
		this.str_name=name;
		this.db_phone=phone;
		this.int_age=age;
		System.out.println("-------Parameterize Constructor Called.------");
	}
	public static void main(String[] args) {
		Account a1=new Account();
		Account a2=new Account("Sanjib Baral",6513669,31);
		a1.str_name="XYZ";
		a1.db_phone=6519876;
		a1.int_age=28;
		a2.int_age=32;
	}

}
