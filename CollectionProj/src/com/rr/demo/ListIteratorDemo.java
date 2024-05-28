package com.rr.demo;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorDemo {

	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		 
		 for(int i=1; i<=10;i++) {
			 v.addElement(new Integer(i));
		 }
		 
		 System.out.println(v);
		 
		 ListIterator<Integer> e = v.listIterator();
		 
		 while (e.hasNext()) {
			Integer i = (Integer) e.next();
			
			if(i == 5 || i==7) {
				e.remove();
			}
			
			if(i==2 || i==4) {
				e.set(new Integer(0));
			}
			
			if(i==3) {
				e.add(new Integer(11));
				}
			
			
		}
		 
		 System.out.println(v);
		 
		 
		 
	}
	
	
	 
	
	
}
