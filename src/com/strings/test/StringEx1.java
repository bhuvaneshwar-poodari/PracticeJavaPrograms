package com.strings.test;

public class StringEx1 {
	
	public static void main(String args[]) {
		/*String s1 = "hello";
		s1=s1+"world";
		System.out.println(s1);	*/
		
		StringBuffer s2 = new StringBuffer("hello");
		
		s2.append("hello");
		System.out.println(s2);
		s2.replace(1, 3, "ab");
		System.out.println(s2);
		
	}

}
