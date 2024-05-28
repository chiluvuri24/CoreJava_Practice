package com.rr.logicalPrograms;

import java.util.Scanner;

public class Fibonacci {

	 public static void main(String[] args) {
		
		 
		 int s=5;
		 
		 int i=0,j=1;
		 
		 for(int temp=1;temp<=s;temp++) {
			 if(temp == 1 ) {
				 System.out.println(i);
			 }else if(temp == 2) {
				 System.out.println(j);
			 }else {
			 int next = i+j;
			 i=j;
			 j=i+j;
			 
			 System.out.println(next+" ---"+i+","+j);
			 }
		 }
		 
		 
		 
	}
}
