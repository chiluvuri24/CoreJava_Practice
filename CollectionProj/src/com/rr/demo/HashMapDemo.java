package com.rr.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
	    
		HashMap< String, Integer> m = new HashMap<>();
		
		m.put("ram", 100);
		m.put("jay", 390);
		m.put("vin", 400);
		m.put("krish", 200);
		
		System.out.println(m);
		
		
		// To get all Keys from Map
		
		Set<String> keys = m.keySet();
		System.out.println(keys);
		
		// To get All Values from Map
		
		Collection<Integer> values = m.values();
		System.out.println(values);
		
		// To Get All Entries
		
		Set<Entry<String, Integer>> entries = m.entrySet();
		
		System.out.println(entries);
		
		
		// TO Iterate Map
		
		Iterator<Entry<String, Integer>> i = entries.iterator();
		
		while (i.hasNext()) {
			
			Map.Entry<String, Integer> entry = i.next();
			
			if(entry.getKey().equals("ram")) {
				entry.setValue(1000);
			}
			
		}
		
		System.out.println(m);
		
		
	}
	
}

