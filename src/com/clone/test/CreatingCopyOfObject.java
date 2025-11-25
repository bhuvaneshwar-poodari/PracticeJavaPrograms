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
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}




public class CreatingCopyOfObject  {
	
	public static void main(String args[]) {
		 Person p1 = new Person(4,"Hello vinay How Are You Whats Going On");
		 Person p2 = (Person)p1;
		p1.details();
		p2.details();
	}
	

}
