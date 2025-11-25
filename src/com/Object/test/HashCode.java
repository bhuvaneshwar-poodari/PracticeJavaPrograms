package com.Object.test;

public class HashCode {
	
	int id;
	String sname;
	HashCode (int id,String sname){
		this.id=id;
		this.sname=sname;
	}
  public void StudentDeatailes() {
	  
	  System.out.println("The Student rollNo is ="+id+"The Student name Is = "+sname);
  }
  	 public static void main(String args[]) {
		 System.out.println("The Students Information is ");
		 
		 HashCode hc = new HashCode(1,"ravi");
		 HashCode hc1= new HashCode(1,"ravi");
		 hc.StudentDeatailes();
		 if(hc.equals(hc1)) {
			 System.out.println("hello");
		 }
		 
	 }
}
