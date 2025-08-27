package com.practice.test;

public class PrintThePrimeNumbers1To100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		   for(int i=1;i<=100;i++) {
			  // int count=0;
			   for(int j=1;j<=i;j++) {
				   int count=0;
				    if(i%j==0) {
				    	count++;
				    }
				    
			   
			   if(count==2) {
				   System.out.println(i+"  ");
			   }
			  
		   }
	}

}
}