package com.strings.test;

public class SubStringEx1 {
	public static void main(String args[]) {
	String s1 = "Hyderabad";
	String s2="";
	
	for(int i=s1.length()-1;i>=0;i--) {
		char ch = s1.charAt(i);
		s2=s2+ch;
		
	}
	System.out.print(s2);
	

}
}