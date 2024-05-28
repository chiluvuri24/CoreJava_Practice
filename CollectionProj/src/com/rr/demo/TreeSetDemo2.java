package com.rr.demo;

import java.util.TreeSet;

public class TreeSetDemo2 {
	
	public static void main(String[] args) {
	    
		TreeSet<StringBuffer> t = new TreeSet<>();
		t.add(new StringBuffer("a"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		
		System.out.println(t);
		
	}
	
}
