package com.multiThreading.test;

public class MultiThreadingEx6 extends Thread {
	
	
		  public void run(){
			  
			  for(int i=1;i<=10;i++) {
				  System.out.println("Thread "+"="+i);		  
			  
		  }
			  }
		  public static void main(String args[]) {
			  
		  
		  
		   MultiThreadingEx6 mt  = new MultiThreadingEx6();
		  mt.start();
	}

}


