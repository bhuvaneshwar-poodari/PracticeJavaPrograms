package com.garbageCollection.test;

public class GarbageCollectionEx1 {

	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		//Test1 t2= new Test1();
		t1=null;
	//	t2=null;
	//t1 = t2;
	System.gc();
		
		Test2 t3 = new Test2();
		t3=null;
		System.gc();

	}

}
class Test1{
	public void bhuvi() {
		System.out.println("hello rambo");
		
	}
	protected void finalize() {
		System.out.println("hey bhuvi");
	}
	
}
class Test2 
{
	int a=20;
	String s1="vamshi";
	
	protected void finalize() {
		System.out.println("hey dhoni");
		
	}
	}
