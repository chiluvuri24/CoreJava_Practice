package com.rr.multithreading;


class Display{
	
	public  void wish(String name) {
		synchronized(Display.class) {
		for(int i=0;i<10;i++) {
			
			System.out.println(" Good Morning ::"+name);
			
			try {				
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
		}
		}
	}
}

class ThreadDemo extends Thread{
	Display d;
	String name;
	
	public ThreadDemo(Display d, String name) {
		this.d=d;
		this.name=name;
	}
	
	public void run() {
		d.wish(name);
	}

}




public class MultiThreadedSynchronizedDemo {
  
	public static void main(String[] args) {
	    
		Display d1 = new Display();
		Display d2 = new Display();
		
		ThreadDemo t1 = new ThreadDemo(d1, "dhoni");
		ThreadDemo t2 = new ThreadDemo(d2, "sehwag");
		
		t1.start();
		t2.start();
		
		
		
    }
}
