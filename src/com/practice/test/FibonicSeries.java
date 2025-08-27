package com.practice.test;

public class FibonicSeries {
	public static void main(String args[]) {
		int f1=0,f2=1;
		
		int f3=f1+f2;
		System.out.print("The fibbonic series is = "+f1+","+f2+",");
		
		for(int i=1;i<9;i++) {
			System.out.print(f3+",");
			
			f1=f2;
			f2=f3;
			f3=f1+f2;
			
		}
		
	   
	}

}
