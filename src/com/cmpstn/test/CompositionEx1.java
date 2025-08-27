package com.cmpstn.test;
 class One {
	public void method1() {
		 System.out.println("calling the method one");
	}
	public void method2() {
		 System.out.println("calling the method two");
	   } 
	}
 class Two
{
	One o;
	public void method3() {
		 System.out.println("calling the method three");
		 o =new One();
		 o.method1();
			}
			public void method4() {
				 System.out.println("calling the method four");
				 o.method2();
			  }
			}
			public class CompositionEx1
			{
				  public static void main(String args[]) {
					  Two t = new Two();
					    t.method3();
					    t.method4();
				  }
			}
			 
	

   
		  
	


