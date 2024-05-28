package com.rr.streams;

import java.util.ArrayList;
import java.util.List;

public class MinMaxDemo {

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>(); 
		   integers.add(25);
		   integers.add(16);
		   integers.add(65);
		   integers.add(9);
		   
		   Integer min = integers.stream().min((i1,i2)->i1.compareTo(i2)).get();
		   
		   Integer max = integers.stream().max((i1,i2)->i1.compareTo(i2)).get();
		   
		   System.out.println(" Min value ::"+min+" Max Value ::"+max);
	}
}
