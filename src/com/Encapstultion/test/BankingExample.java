package com.Encapstultion.test;

public class BankingExample {
	
	public  double balance;
	
	/*BankingExample(double balance){
		this.balance=balance;
	}*/
	
	public void withDraw(double amount) {
	   if(amount>0) {
		 balance-=amount;
		 System.out.println("The  Totall Balance is = "+balance);
	   }
	   else {
		   System.out.println("Insufficent amount");
	   }
	}
	public void deposite(double amount) {
		
		balance+=amount;
		 System.out.println("The  Totall Balance is = "+balance);
	}
	public double getBalance() {
		System.out.println("The final amount is ="+balance);
		return balance;
		
	}
	public static void main(String args[]) {
		System.out.println("WELL COME TO THE SBI BANK");
		
		BankingExample be = new BankingExample();
		be.getBalance();
	
		
	}

}
