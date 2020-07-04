package com.ita.training.java.access_specifiers.pack1;

public class A {
	private int private_int_var=3;
	private String private_str_var="Sanjib";
	double default_long_var=6;
	protected int protected_int_var=7;
	public int public_int_var=9;
	
	public static void main(String[] args) {
		A a1= new A();
		a1.public_method();
		a1.private_method();
		a1.protected_method();
		
	}
	
	
	private void private_method() {
		System.out.println("Private Method of Class A");
		System.out.println("Printing Private Variable of Class A");
		System.out.println(private_int_var);
		System.out.println(private_str_var);
	}
	
	protected void protected_method() {
		System.out.println("Protected Method of Class A");
		
	}
	
	public void public_method() {
		System.out.println("Public Method of Class A");
	}
	
	void default_method() {
		System.out.println("Default Method of Class A");
	}

}
