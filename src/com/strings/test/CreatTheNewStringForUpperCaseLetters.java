package com.strings.test;

import java.util.Scanner;

public class CreatTheNewStringForUpperCaseLetters {

	public static void main(String[] args) {
		
		System.out.print("Enter The String = ");
		Scanner sc = new Scanner(System.in);
	    String s =sc.next();
	    String str =" ";
	char ch[] =s.toCharArray();
	
	for(int i=0;i<ch.length;i++) {
		if(Character.isUpperCase(ch[i])) {
			
			str=str+ch[i];
		
	}
		

	}
System.out.println(str);
}}
