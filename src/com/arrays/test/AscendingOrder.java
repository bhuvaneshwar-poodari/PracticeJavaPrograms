package com.arrays.test;

public class AscendingOrder {
	
	public static void main(String args[]) {
		
		int a[] = {34,4,23,56,46,78};
		
		int temp;
		int biggestnumber=0;;
		for(int i=0;i<a.length-1;i++) {
		 if(a[i]<a[i+1]) {
			 temp=a[i];
			 a[i]=a[i+1];
			 a[i+1]=a[i];
			 biggestnumber=a[i];
		 }
			
			
		}
		System.out.print("The Biggest Number Is = "+biggestnumber);
	
}
}