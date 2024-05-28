package com.rr.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	
	public static void main(String[] args) throws FileNotFoundException,IOException{
		Properties p = new Properties();
		
		FileInputStream fis = new FileInputStream("abc.properties");
		p.load(fis);
		System.out.println(p);
		
		System.out.println(p.getProperty("ram"));
		
		p.setProperty("bala", "bala123");
		
		FileOutputStream fos = new FileOutputStream("abc.properties");
		
		p.store(fos, "Updated by admin");
		
		
		
	}
}
