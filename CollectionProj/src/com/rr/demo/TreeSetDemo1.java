package com.rr.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo1 {
	
	public static void main(String[] args) {
		
		TreeSet<Object> t = new TreeSet<>();
		
		t.add("a");
		t.add("A");
		t.add("Z");
		t.add("L");
		t.add("M");
		
		
		
		
		//t.add(new Integer(7)); // For TreeSet only Homogeneous type of elememnts allowed otherwise we will get ClassCastException
		System.out.println(t);
		
		//System.out.println(Collections.sort);
		
		
		ArrayList<String> al = new ArrayList<>();
		al.add("sdhghf");
		al.add("ddhghf");
		al.add("cdhghf");
		al.add("zdhghf");
		al.add("jdhghf");
		
		System.out.println(" Before Sorting "+al);
		Collections.sort(al);
		System.out.println(" After Sorting DNSO"+al);
		
		//TreeSetDemo1.MyComp comp = new TreeSetDemo1.MyComp();
		TreeSetDemo1 tt = new TreeSetDemo1();
		
		Collections.sort(al,tt.new MyComp());
		
		System.out.println(" After Sorting Customized "+al);
		
		
		
	}
	
	class MyComp implements Comparator<String>{
		
		
		public int compare(String o1, String o2) {
		
			
			
			return o2.compareTo(o1);
		}
	}

}
