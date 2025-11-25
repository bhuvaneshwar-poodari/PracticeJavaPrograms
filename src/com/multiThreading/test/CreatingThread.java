package com.multiThreading.test;

public class CreatingThread extends Thread {
public void run() {
	System.out.println("This is usedefined Thread"+Thread.currentThread().getName());
	}
	 public static void main(String args[]) {
		 CreatingThread cr = new CreatingThread();
		 Thread th = new Thread(cr);
		 
		 
		 th.start();
	 }
}
