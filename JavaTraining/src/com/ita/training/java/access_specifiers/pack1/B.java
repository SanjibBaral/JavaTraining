package com.ita.training.java.access_specifiers.pack1;

public class B {

	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1.protected_int_var);
		System.out.println(a1.public_int_var);
		a1.protected_method();
		a1.default_method();
		a1.public_method();
	}
}
