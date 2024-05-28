package com.rr.streams;

import java.util.ArrayList;
import java.util.List;

public class OfDemo {

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>(); 
		   integers.add(25);
		   integers.add(16);
		   integers.add(65);
		   
		   
		   integers.stream().map(x->x*x).forEach(x->System.out.println(x));
		   
	}
}
