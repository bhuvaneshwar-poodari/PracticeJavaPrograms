package com.ClassesTypes.test;

public class StaticInnerClass {
	   static int rollno;
	   static String name;
	   StaticInnerClass(int rollno,String name){
		   this.rollno=rollno;
		   this.name=name;
	   }
	   public void display() {
		   System.out.println(rollno+","+name);
	   }
	static class Bhuvi{
		public void conversation() {
		System.out.println("hey srinu how are you");
		}
		
		
	}
	
	public static void main(String args[]) {
		StaticInnerClass sc = new StaticInnerClass(34,"roman");
	sc.display();
	}

}
