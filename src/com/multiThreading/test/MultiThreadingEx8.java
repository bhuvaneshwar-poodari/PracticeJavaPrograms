package com.multiThreading.test;

public class MultiThreadingEx8 extends Thread {
	int count =0;
	public void increment() {
		count++;
	}
		
	
	
	
	public void run() {
		
		for(int i=1;i<=100;i++) {
		increment();
	}
	}
	public static void main(String args[]) throws InterruptedException {
		
		MultiThreadingEx8 mt = new MultiThreadingEx8();
		Thread  t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(mt.count);
	}
	
		
	
	
	
	


}
