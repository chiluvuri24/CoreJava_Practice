package com.rr.demo;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class IteratorDemo {

	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		 
		 for(int i=1; i<=10;i++) {
			 v.addElement(new Integer(i));
		 }
		 
		 System.out.println(v);
		 
		 
		 System.out.println(Collections.binarySearch(v, new Integer(11)));
		 
		 
		 
		 Iterator<Integer> e = v.iterator();
		 
		 while (e.hasNext()) {
			Integer integer = (Integer) e.next();
			
			if(integer % 2 == 0) {
				System.out.println( integer +" is Even ");
			}else {
				e.remove();
			}
			
		}
		 
		 System.out.println(v);
		 
		 
		 
	}
	
	
	 
	
	
}
