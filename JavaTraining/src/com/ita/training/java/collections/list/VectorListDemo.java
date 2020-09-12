package com.ita.training.java.collections.list;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorListDemo {
	public static void main(String[] args) {
		List v=new Vector();
		v.add("First Entry in Vector List");
		v.add(2);
		v.add(v.isEmpty());
		VectorListDemo a=new VectorListDemo();
		a.printLinkedList(v);
		v.remove(1);
		v.add(1,456);
		a.printLinkedList(v);
	}
	
	public void printLinkedList(List ll) {
		System.out.println("Printing Vector List items using Iterator");
		Iterator it=ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}


}
