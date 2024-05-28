package com.rr.streams;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo {
   public static void main(String[] args) {
	
	   
	   List<Integer> integers = new ArrayList<>(); 
	   integers.add(25);
	   integers.add(16);
	   integers.add(65);
	   
	   integers.stream().filter(x->x%2==0).forEach(x->System.out.println(x));
	   
	   
}
}
