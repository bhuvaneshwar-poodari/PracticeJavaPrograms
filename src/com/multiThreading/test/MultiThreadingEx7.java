package com.multiThreading.test;

public class MultiThreadingEx7 implements Runnable {

	@Override
	public void run() {
		
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
				
			}
			System.out.println(Thread.currentThread().getName()+""+i);
			
			
		}
		
	}
	public static void main(String args[]) {
		System.out.println("Main Thread = "+Thread.currentThread().getName());
	
		MultiThreadingEx7 mt = new MultiThreadingEx7();
		Thread th = new Thread(mt);
		
		th.start();
	}

}
