package com.multiThreading.test;

public class CheckingThreadLifeCycle {
	public static void main(String args[]) throws InterruptedException {
		NewEx1 n1= new NewEx1();
		
		n1.start();
		n1.join();
		Thread.currentThread().getName();
		System.out.println("dont show of your talented in unneccessary placess");
	}

}
class NewEx1 extends Thread{
	public void run() {
	for(int i=0;i<=4;i++) {
		System.out.println("i never give up until i reached my goal"+i);
	}
	}
}