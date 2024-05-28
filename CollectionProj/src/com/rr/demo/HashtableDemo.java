package com.rr.demo;

import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		Hashtable<Temp, String> h = new Hashtable<>(25);
		h.put(new Temp(9), "A");
		h.put(new Temp(18), "B");
		h.put(new Temp(7), "C");
		h.put(new Temp(6), "D");
		h.put(new Temp(15), "E");
		h.put(new Temp(22), "F");
		System.out.println(h);
		
		
	}
	
	
	
}

class Temp{
	int i;
	
	Temp(int i){
		this.i=i;
	}
	
	@Override
	public int hashCode() {
		
		return i;
	}
					
	@Override
	public String toString() {
		
		return i+"";
	}
	
	
}
