package com.practice.test;

public class SumOfDigits {
	
	public static void main(String args[]) {
		int num = 123;
		
		int sum=0;
		int temp;
		temp=num;int n;
		while(temp>0) {
			
			n=temp%10;
			
			sum=sum+n;
			temp=temp/10;
			
		
			
		}
		System.out.print(sum);
	}

}
