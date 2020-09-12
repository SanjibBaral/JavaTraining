package com.ita.training.java.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set set=new HashSet();
		set.add(12);
		set.add("abc");
		set.add(34);
		set.add(12);
		set.add("abc");
		set.add(345);
		set.add("a");
		printHashSet(set);
		set.remove(12);
		printHashSet(set);
		}

	public static void printHashSet(Set set) {
		System.out.println("Printing items in HashSet.");
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
