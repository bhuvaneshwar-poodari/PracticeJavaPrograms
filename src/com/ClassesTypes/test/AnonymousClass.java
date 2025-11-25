package com.ClassesTypes.test;

public class AnonymousClass  {
	
	public static void main(String args[]) {
		
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("heloo");
			}
		};
		//AnonymousClass c = new AnonymousClass();
		Thread th = new Thread(r);
		th.start();
		
	}

	

}
