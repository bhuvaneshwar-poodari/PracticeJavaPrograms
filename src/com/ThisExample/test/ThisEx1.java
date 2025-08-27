package com.ThisExample.test;

public class ThisEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Two t = new Two();
        t.cat();
	}

}
class Two{
	public void dog(){
		System.out.println("The dog is shouting");
	}
	public void cat() {
		System.out.println("The cat waiting for milk");
		this.dog();    //using this key word to accessing the current class method;
	}

}
