package com.rr.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectDemo {

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>(); 
		   integers.add(25);
		   integers.add(16);
		   integers.add(16);
		   integers.add(65);
		   
		   
		   Set<Integer> val = integers.stream().map(x->x*x).collect(Collectors.toSet());
		   
		   System.out.println(val);
		   
	}
}
