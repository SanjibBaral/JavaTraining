package com.ita.training.java.interfaces;

public class Test4 extends Test3 implements Test1, Test2{
	public void test1() {
		System.out.println("Overriding test1 method from Test 1");
	}
	
	public void test2() {
	System.out.println("Overriding test2 method from Test 2.");	
	}
	
	public static void main(String[] args) {
		Test4 t=new Test4();
		t.test1();
		t.test2();
		t.test3();
	}

}
