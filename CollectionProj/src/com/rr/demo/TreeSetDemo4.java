package com.rr.demo;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo4 {
	
	public static void main(String[] args) {
	    
		TreeSet<Object> t = new TreeSet<>(new MyComparator1());
		t.add("aa");
		t.add("dbhh");
		t.add(new StringBuffer("AOPPPP"));
		t.add("uuu");
		t.add(new StringBuffer("AOIIE"));
		
		System.out.println(t);
		
	}
	
}

class MyComparator1 implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		
		  String s1= o1.toString();
		  String s2= o2.toString();
		
		int i1 = s1.length();
		int i2 = s2.length();
		
		if(i1 < i2) {
			return 1;
		}else if(i1>i2) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
}
