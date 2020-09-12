package com.ita.training.java.collections.set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set set=new LinkedHashSet();
		set.add(12);
		set.add("abc");
		set.add(34);
		set.add(12);
		set.add("abc");
		set.add(345);
		set.add("a");
		printHashSet(set);
		set.remove(12);
		set.add(getArrayList());
		set.add(getArrayList());
		printHashSet(set);
		}

	public static void printHashSet(Set set) {
		System.out.println("Printing items in LinkedHashSet.");
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static ArrayList getArrayList() {
		ArrayList al=new ArrayList();
		for(int i=0;i<10;i++) {
			al.add(i);
		}
		return al;
	}
}
