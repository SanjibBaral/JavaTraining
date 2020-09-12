package com.ita.training.java.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		List ll=new LinkedList();
		ll.add("First Entry on Linked List");
		ll.add(2);
		ll.add(ll.isEmpty());
		LinkedListDemo a=new LinkedListDemo();
		a.printLinkedList(ll);
		ll.remove(1);
		ll.add(1,456);
		a.printLinkedList(ll);
	}
	
	public void printLinkedList(List ll) {
		System.out.println("Printing LinkedList items using Iterator");
		Iterator it=ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
