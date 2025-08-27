package com.multiThreading.test;

public class MultiThreadingEx5 {
	public static  void main(String args[]) {
		First f1 = new First();
		Thread th = new Thread(f1);
		th.start();
		
		
		
		
	}

}
/*interface Runnable{
}*/
class First implements Runnable{
	public void run() {
		Runnable rn = ()-> {
			System.out.println("hello bhuvi");
		};
			rn. run();
		
		
	}
	
}