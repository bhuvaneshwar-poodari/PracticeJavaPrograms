package com.Anonyoums.test;
import java.util.Scanner;
interface Cat{
	void ravi();
}

public class LambdaExpressionExample1 {

	
	
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter any integer number");
		int n =sc.nextInt();
		Cat c = new Cat() {
		public void ravi() {
			if(n%2==0) {
				System.out.println(n+" This number is even number ");
			}
			else {
				System.out.println("its not a even number ");
			}
		  
		}
	
	};
	c.ravi();
	
	}

}
