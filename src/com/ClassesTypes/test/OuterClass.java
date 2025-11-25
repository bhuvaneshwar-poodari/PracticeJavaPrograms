package com.ClassesTypes.test;

public class OuterClass {

 class InnerClass{
		int rollno;
		String name;
		InnerClass(int rollno,String name){
			this.rollno=rollno;
			this.name=name;
		}
		public void display() {
			System.out.println("The Inforamtion Of Person = "+rollno+" ,"+name);
		}
	
	}
 public static void main(String args[]) {
	 OuterClass out = new  OuterClass();
	 OuterClass.InnerClass ic = out.new InnerClass(23,"bhuvi");
	 ic.display();
 }
	
}
