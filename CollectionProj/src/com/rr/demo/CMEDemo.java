package com.rr.demo;

import java.util.ArrayList;
import java.util.Iterator;

class CMEDemo extends Thread{

	
	static ArrayList<String> l = new ArrayList<>();
	
	public void run() {
		System.out.println(" started");
		try {			
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
			System.out.println(" Child Thread Updating lIST");
			l.add("d");
			
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Exeexxexexex");
		
		l.add("a");
		l.add("b");
		l.add("c");
		
		CMEDemo t = new CMEDemo();
		t.start();
		
		
		
		Iterator<String> itr = l.iterator();
		
		while (itr.hasNext()) {
				String s1 = itr.next();
				System.out.println("Main Thread Iterating List and current obj is ::"+s1);
				Thread.sleep(3000);
				
		}
		
		System.out.println(l);
		
	}
	
}


