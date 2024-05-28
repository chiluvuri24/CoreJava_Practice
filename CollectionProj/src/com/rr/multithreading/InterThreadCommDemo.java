package com.rr.multithreading;

import java.util.Iterator;

class ThreadB extends Thread{
	int x=0;
	
	public void run(){
		
		synchronized (this) {
			
			System.out.println(" Child Thread Started Calculating value of X ");
			
			for(int i=0; i<=100;i++) {
				try {				
					Thread.sleep(10);
				} catch (Exception e) {
					// TODO: handle exception
				}
				x=x+i;
				//System.out.println(x);
			}
			System.out.println(" Child Thread Completed Calculation and notifies Main Thread ");
			this.notify();	
		}
		
		
	}
	
	
}



public class InterThreadCommDemo {

	public static void main(String[] args) throws InterruptedException{
		
		
		ThreadB b =new ThreadB();
		b.start();
		synchronized (b) {
			
			System.out.println(" Main Threads waiting to get Value from child Thread");
			
			
			try {				
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(" Main Thread Enters into Waiting State because of calling wait on Child Thread");
			b.wait();
			System.out.println(" Child Thread Notified and main thread started");
		
			
		}
		
		System.out.println(" The Value of X is :::"+b.x);
		
		
	}
	
	
}
