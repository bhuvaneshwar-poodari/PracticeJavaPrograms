package com.bhuvi.LamdaExpressions;

public class LamdaExpressionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee emp = new Employee();
		
		Student st = new Student() {      // this is anonyoums inner class...
		
		public void studentOne() {
			System.out.println("i am bhuvi");
		}
		
};
st.studentOne();

StudentEx1 st2 =() ->{  System.out.println("hey rambo");// this is lambda epression..
};

	st2.studentTwo();
}
        }

interface Student{
	 public void studentOne();
}


/*class Employee1 implements Student{
	public void studentOne() {
		System.out.println("i am bhuviiii");
	}
}*/
interface StudentEx1{

	public void studentTwo();
}
class Employee2 implements StudentEx1{
	public void studentTwo(){
		System.out.println(" ");
	}
}