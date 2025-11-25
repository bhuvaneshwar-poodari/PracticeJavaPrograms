package com.arrays.test;

public class CopyElementsFromOneArrayToAnother {
	
	public static void main(String args[]) {
		int a[]= {23,54,12,34,43,78,86};
		int a1[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			a1[i]=a[i];
		}
		//printing first elements
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		//printing second elements
		for(int i=0;i<a1.length;i++) {
			System.out.print(a1[i]+" ");
		}
		
	}

}
