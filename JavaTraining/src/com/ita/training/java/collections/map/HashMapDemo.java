package com.ita.training.java.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map mp=new HashMap();
		mp.put("Name", "Pokhara");
		mp.put("Details", new ArrayList());
		Set set=mp.keySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(mp.get(it.next()));
		}
		System.out.println(mp.size());
		System.out.println(mp.get("City"));
	}

}
