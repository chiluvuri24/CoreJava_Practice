package com.rr.strings;

import java.util.List;

public class EqualsAndDoubleEqualTOOperator {
	public static void main(String[] args) {
		
//		/*
//		 * String s1 = new String("rama"); String s2 = new String("rama");
//		 * System.out.println(s1==s2); System.out.println(s1.equals(s2));
//		 * 
//		 * 
//		 * StringBuffer sb1 = new StringBuffer("rama"); StringBuffer sb2 = new
//		 * StringBuffer("rama"); System.out.println(sb1==sb2);
//		 * System.out.println(sb1.equals(sb2));
//		 */
		
		
		List<Integer> intList = List.of(23,67,89,56,45);
		
		
		System.out.println(intList.stream().max((a,b)->a.compareTo(b)).get());
		
		
		
	}
}

