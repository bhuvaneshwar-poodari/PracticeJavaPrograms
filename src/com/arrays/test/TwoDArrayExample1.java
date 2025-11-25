package com.arrays.test;

public class TwoDArrayExample1 {
  public static void main(String args[]) {
	  int a[][]= {{2,4,5,},{23,4},{23,54,6,7,7}};
	  for(int i=0;i<a.length;i++) {
		  int k=0;
		  for(int j=0;j<a[i].length;j++) {
			  k=k+a[i][j];
			  System.out.print(k+"");
		  }
		
		  System.out.println();		 
		  }
      } 
  }