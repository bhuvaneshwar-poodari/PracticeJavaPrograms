package com.inheritance.test;



public class MultipleInheritance extends ClassA{
	
	
	public static void main(String args[]) {
		
		 ClassA  a = new ClassA();
		 a.show();
		 ClassB b= new ClassB();
		 b.disply();
	}

}
class ClassA {
	public void show()
{
		System.out.println("This is the Class A");
		}
}
class ClassB {
	public void disply() {
		System.out.println("This is the Class B");
	}
}
