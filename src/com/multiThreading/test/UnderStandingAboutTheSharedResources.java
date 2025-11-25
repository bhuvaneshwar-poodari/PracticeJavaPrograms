package com.multiThreading.test;

public class UnderStandingAboutTheSharedResources extends Thread {
	
	public  void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("This is my"+i+"attempt");
		}
	}
public static void main(String args[]) throws InterruptedException {
	UnderStandingAboutTheSharedResources us = new UnderStandingAboutTheSharedResources();
	
	Thread th = new Thread(us);
	Thread th1= new Thread(us);
	 th.start();
	 th.join();
	  th1.start();
}
}
