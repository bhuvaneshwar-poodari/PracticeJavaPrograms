package com.ClassesTypes.test;

public class MemberInnerClass {
public void inivation() {
	System.out.println("Well Come To The College");
}
	class InnerClass{
		
		private String name;
		private int rollno;
		InnerClass(String name,int rollno){
			this.name=name;
			this.rollno=rollno;
		}
		public void disply() {
			System.out.println("The Student Detailes Is = "+name+"And RollNo"+rollno);
		}
	}
public static void main(String args[]) {
	MemberInnerClass ms = new MemberInnerClass();
	//ms.inivation();
	MemberInnerClass.InnerClass ic = ms.new InnerClass("ravi",45);

}
}