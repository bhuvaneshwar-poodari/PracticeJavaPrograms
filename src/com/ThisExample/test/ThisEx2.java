package com.ThisExample.test;

public class ThisEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student st = new Student(10,"rambo",67.00);
     st.studentsDetails();
	}

}
class Student{
	int rollNo;
	String name;
	double marks;
	Student(int rollNo,String name,double marks){
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
		
	}
	public void studentsDetails() {
		System.out.println("Student RollNo ="+rollNo +"\n"+"Student Name ="+name+"\n"+"Studnet Marks ="+marks);
	}
}
