package com.polymorphisam.test;

public class SBIBANK  {

	public void withdraw()
	{
		System.out.println("The Transiction is Successfull");
	}
	public static void main(String args[]) {
		SBIBANK s = new SBIBANK();
		GooglePay g =new GooglePay();
		Creditcard c =new Creditcard();
		s.withdraw();
		g. withdraw();
		c. withdraw();
	}
}
class GooglePay{
	public void withdraw() {
		System.out.println("The Money Draw From The GooglePay");
	}
}
class Creditcard{
	public void withdraw() {
		System.out.println("The Money Draw From Creditcard");
	}
}