package com.rr.demo;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
	
	public static void main(String[] args) {
	    
		TreeSet<String> t = new TreeSet<>(new MyComparator());
		t.add("a");
		t.add("B");
		t.add("A");
		t.add("Z");
		
		System.out.println(t);
		
	}
	
}

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		return -s1.compareTo(s2);
	}
	
}
