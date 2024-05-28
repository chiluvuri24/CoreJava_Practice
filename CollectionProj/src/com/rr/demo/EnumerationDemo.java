package com.rr.demo;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		 
		 for(int i=1; i<=10;i++) {
			 v.addElement(new Integer(i));
		 }
		 
		 System.out.println(v);
		 
		 Enumeration<Integer> e = v.elements();
		 
		 while (e.hasMoreElements()) {
			Integer integer = (Integer) e.nextElement();
			
			if(integer % 2 == 0) {
				System.out.println( integer +" is Even ");
			}
			
		}
		 
		 
		 
		 
	}
	
	
	 
	
	
}
