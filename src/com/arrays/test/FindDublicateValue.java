package com.arrays.test;

public class FindDublicateValue {
 public static void main(String args[]) {
	 int a[] = {4,45,3,65,45,3,2,4};
	 
	 for(int i=0;i<a.length;i++) {
		 for(int j=i+1;j<a.length;j++) {
			 if(a[i]==a[j]) {
				 System.out.print(a[j]+" ");
			 }
		 }
	 }
 }
}
