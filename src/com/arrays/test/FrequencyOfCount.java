package com.arrays.test;

public class FrequencyOfCount {

	public static void main(String args[]) {
		int a[]= {3,45,3,5,2,45,6,76,6};
		
		for(int i=0;i<a.length;i++) {
		 int count =1;
		 
		 for(int j=i+1;j<a.length;j++) {
			 
			 if(a[i]==a[j]) {
				 count++;
				 
			 }
		 }
		 System.out.println(a[i]+"count = "+count);
		}
	}

}
