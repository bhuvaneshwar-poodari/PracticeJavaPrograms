package com.multiThreading.test;

public class MultiThreadingEx3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Test1 t = new Test1();
		Thread td = new Thread(t);
		
		td.start();
		//Thread.yield();
		Thread.sleep(10000);
		for(int i=0;i<=9;i++) {
			System.out.println("main Thread"+i);
			}	
		

	}

}
class Test1 extends Thread {
	public void run() {
	
		//Thread.yield();
		try {
		Thread.sleep(1000);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	for(int i=0;i<=9;i++) {
		System.out.println("child thread"+i);
	}
	
	
	}
}
