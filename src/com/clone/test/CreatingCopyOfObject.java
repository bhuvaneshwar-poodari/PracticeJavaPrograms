package com.clone.test;

class Person implements Cloneable {
	
	int rollno;
	String name;
	public Person(int rollno,String name) {
		
		this.rollno=rollno;
		this.name=name;
	}
	public void details() {
		System.out.println(rollno+""+","+name+"");
	}
	
}




public class CreatingCopyOfObject  {
	
	public static void main(String args[]) {
		 Person p1 = new Person(4,"bhuvi");
		 Person p2 = new Person(4,"bhuvi");
		p1.details();
		p2.details();
	}
	

}
