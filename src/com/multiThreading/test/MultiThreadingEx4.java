package com.multiThreading.test;

public class MultiThreadingEx4 {
	public static void main(String args[]) {
		
		for(int i=0;i<5;i++) {
			System.out.println("main Thread "+i);
		}
			Test2 t = new Test2();
			Thread th = new Thread (t);
			th.start();
	

}
	}
class Test2 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("child Thread "+i);
		}
	}

}
	
