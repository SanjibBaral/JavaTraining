package com.ita.training.java.access_specifiers.pack2;

import com.ita.training.java.access_specifiers.pack1.A;

public class X {
	public static void main(String[] args) {
		A a1=new A();
		a1.public_method(); //Only public method accessibel outside package.
	}

}
