package com.ita.training.java.exceptions;

public class RunTimeExceptionDemo {
	public static void main(String[] args) {
		int a[]=new int[2];
		try{
			for(int i=0;i<3;i++) {
		
			a[i]=10*i+i;
			}
			}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array exceeded it defined size");
		}
	}

}
