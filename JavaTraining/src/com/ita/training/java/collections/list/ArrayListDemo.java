package com.ita.training.java.collections.list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List al=new ArrayList();
		al.add(123);
		al.add("Hello");
		al.add(true);
		System.out.println("Printing using For Loop");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		al.add("Happy");
		al.add(2);
		print_ArrayList(al);
		al.remove(2);
		print_ArrayList(al);
		al.remove(2);
		print_ArrayList(al);
		al.add(0, "I am inserted at the beginning.");
		al.add(al.size(),"I m inserted at the last.");
		print_ArrayList(al);
	}
	
	public static void print_ArrayList(List al) {
		System.out.println("Printing with Iterator");
		Iterator it=al.iterator();
		while(it.hasNext())
			System.out.println(it.next());

	}

}
