package com.strings.test;

public class WhichIsExecutedFirst {
	
	int a=9;
	static {
		System.out.println("i am bhuvi");
		
	}
	{
		System.out.println("my roll no is =19 ");
		
	}
	WhichIsExecutedFirst(int a){
		System.out.println("Constructor called");
		System.out.println(a);
	}
	
public static void main(String args[]) {
	 WhichIsExecutedFirst f1 = new  WhichIsExecutedFirst(5);
	 
	 
}
}
