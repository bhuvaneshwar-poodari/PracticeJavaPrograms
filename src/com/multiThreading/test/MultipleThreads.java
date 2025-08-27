package com.multiThreading.test;
	 class Thread1 extends Thread {
		 public void run() {

			    for(int i=1;i<=5;i++) {
			    	System.out.println(Thread.currentThread().getName());
			    	
			    }
		 }
	}

public class  MultipleThreads {
	public static void main(String args[]) {
		//Thread.currentThread().setName("rambo");
		for (int i=0;i<5;i++) {
			System.out.println(i+"ram");
			//Thread.yield();
		}
		Thread1 t1 = new Thread1();
		//t1.setName("bhuvi");
	t1.yield();
		t1.start();
		
		
		
    	
	}
}