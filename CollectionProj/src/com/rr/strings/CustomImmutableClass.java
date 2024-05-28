package com.rr.strings;

public class CustomImmutableClass {
    private int i;
    
    public CustomImmutableClass(int i) {
    	this.i=i;
    }
    
    public CustomImmutableClass modify(int i) {
    	if(this.i == i) {
    		return this;
    	}else {
    		return new CustomImmutableClass(i);
    	}
    }
    
    public static void main(String[] args) {
    	
    	CustomImmutableClass c1 = new CustomImmutableClass(10);
    	CustomImmutableClass c2 = c1.modify(10);
    	CustomImmutableClass c3 = c1.modify(100);
    	
		System.out.println(c1==c2);
		System.out.println(c1==c3);
	}
    
}



