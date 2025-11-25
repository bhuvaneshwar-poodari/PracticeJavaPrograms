package com.inheritance.test;

public class MultipleInheritanceThroughTheInterfaces implements ravi,rambo{
	
	
	public void ravideatiles() {
		System.out.println("He is The Clearver Student");
	}
	public void rambodeatiles() {
		System.out.println("He is The Intillegent Student");
	}

	public static void main(String args[]) {
		MultipleInheritanceThroughTheInterfaces mi = new MultipleInheritanceThroughTheInterfaces();
		mi.ravideatiles();
        mi.rambodeatiles();
		
	}
	

}
interface ravi{
	public void ravideatiles();
	
}
interface  rambo{
	public void rambodeatiles();

}