package com.ThisExample.test;

public class ThisEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
One o = new One(20);

	}

}
class One{
	public One() {
		System.out.println("it is the zero parmiterized constructor");
	}
	public One(int a) {
		this();
		System.out.println("it is the parmiterized constructor");
		
	}
}