package com.rr.strings;

public class StringStrBufferDemo {

	public static void main(String[] args) {
		String s1 = new String("rama");
		s1.concat("raju");
		System.out.println(s1);
		
		StringBuffer s2 = new StringBuffer("rama");
		s2.append("raju");
		System.out.println(s2);

	}

}
