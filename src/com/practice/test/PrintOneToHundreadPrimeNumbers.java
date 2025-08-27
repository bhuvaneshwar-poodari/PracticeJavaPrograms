package com.practice.test;

public class PrintOneToHundreadPrimeNumbers {
	
	public static void main(String args[]) {
		int n=100;
		
		System.out.print("THe prime numbers are = ");
		for(int i=1;i<=100;i++) {
			int count=0;
			for(int j=1;j<=n;j++) {
				
				if(i%j==0) {
					count++;			
					}
			}
			
			if(count==2) {
				System.out.print(i+",");
			
				
				
			}
		}
		
	}

}
