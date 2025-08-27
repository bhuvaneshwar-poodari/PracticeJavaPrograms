package com.strings.test;

public class StringEx2 {
    public static void main(String args[]) {
        String s = new String("hyderabad");

        // Loop to print characters from end to start
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.charAt(i)); // ✅ Use s.charAt(i) here
        }
    }
}
