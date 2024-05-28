package com.rr.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortedDemo {

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>(); 
		   integers.add(25);
		   integers.add(16);
		   integers.add(16);
		   integers.add(65);
		   
		   
		   integers.stream().sorted((i1,i2)->i2.compareTo(i1)).forEach(x->System.out.println(x));;
		
		   
		   List<String> strs = new ArrayList<>(); 
		   strs.add("f");
		   strs.add("l");
		   strs.add("v");
		   strs.add("c");	   
		   
		   // Default Sorting
		   strs.stream().sorted().forEach(x->System.out.print(x));
		// Customized sorting
		   strs.stream().sorted((s1,s2)->s2.compareTo(s1)).forEach(x->System.out.print(x));
		   
	}
}
