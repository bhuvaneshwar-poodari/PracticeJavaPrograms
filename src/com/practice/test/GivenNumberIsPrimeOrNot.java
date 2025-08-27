package com.practice.test;

import java.util.Scanner;

public class GivenNumberIsPrimeOrNot {
	
	public static void main(String args[]) {
		System.out.println("Enter any postive number");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		
	 int count =0;
		for(int i=1;n>=i;i++) {
			if(n%i==0) {
			count++;
			}
		}
		if(count==2) {
			System.out.println("Its Prime number");
		}
		else {
			System.out.println("Its not a Prime number");
			
		}
		
	
	}

}
