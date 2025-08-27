package com.strings.test;

public class PrintUpperCaseLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
      String s= "Java Programing Language";
      int count=0;
       for(int i=0;i<s.length();i++) {
         char ch = s.charAt(i);
      
         if(Character.isUpperCase(ch)) {
        	// System.out.print(ch+" ");
        	count++;
         }
        
	}
       System.out.println(count+"");
}
}