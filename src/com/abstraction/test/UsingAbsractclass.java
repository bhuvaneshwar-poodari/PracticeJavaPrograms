package com.abstraction.test;


abstract class Animal{
	
	String name;
	public Animal(String name) {
		this.name=name;
	}
	abstract void disply();
}
public class UsingAbsractclass extends Animal {
  
	public UsingAbsractclass(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void disply() {
		System.out.println("its shown by the Animal details");
	}
	public static void main(String args[]) {
		UsingAbsractclass ua = new UsingAbsractclass("bhuvi");
		
	}

}
