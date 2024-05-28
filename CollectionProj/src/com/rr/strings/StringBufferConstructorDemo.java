package com.rr.strings;

public class StringBufferConstructorDemo {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());// Default capacity -- 16
		
		sb.append("abcdefghijklmnop");
		System.out.println(sb.capacity());// Still capacity -- 16
		sb.append("abcdefghijklmnopq");
		System.out.println(sb.capacity());
		// Now we are trying to add 17th char so capacity will be capacity = (CC+1)*2 = 34 
		sb.append("abcdefghijklmnopqr");
		System.out.println(sb.capacity());
		// Now we are trying to add 17th char so capacity will be capacity = (CC+1)*2 = 70
		
		StringBuffer sb2 = new StringBuffer(5);
		sb2.append("abcdef");
		System.out.println(sb2.capacity());
		
		
		
	}
}
