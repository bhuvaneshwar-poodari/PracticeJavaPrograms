package com.polymorphisam.test;

public class MethodOverloading {
	
	public String details(String name) {
		return name;
		
	}
	public int details(int rollno) {
		return rollno;
		
	}
	
	public static void main(String args[]) {
		MethodOverloading mo = new MethodOverloading();
		System.out.println(mo.details("bhuvi"));  // This will print: bhuvi
	    System.out.println(mo.details(23)); 
	}

}
