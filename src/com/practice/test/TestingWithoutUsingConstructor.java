/*package com.practice.test;

public class TestingWithoutUsingConstructor {
 
	int rollNo;
	String name;
	public void bhuvi(int rollNo,String name) {
		System.out.println("The Student Roll No is = " +rollNo+"   "+  "The Student Name is ="+name);//HERE WE ARE NOT ASSIGN THE VALUES THEN IT WILL NOT STORED THE ELEMENTS
	}
	public static void main(String args[]) {
		TestingWithoutUsingConstructor ts = new TestingWithoutUsingConstructor();
		ts.bhuvi(34,"rambo");
	}
}
*/
package com.practice.test;

public class TestingWithoutUsingConstructor {
 
    int rollNo;
    String name;

    public void bhuvi() {  // No parameters
        System.out.println("The Student Roll No is = " + rollNo + " The Student Name is = " + name);
    }

    public static void main(String args[]) {
        TestingWithoutUsingConstructor ts = new TestingWithoutUsingConstructor();
        ts.rollNo = 34;  // ✅ Assign values directly
        ts.name = "rambo"; 
        ts.bhuvi();  // ✅ Call method without parameters
    }
}
