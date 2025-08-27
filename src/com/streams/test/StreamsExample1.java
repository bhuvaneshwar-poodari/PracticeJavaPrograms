package com.streams.test;
import java.util.*;

public class StreamsExample1 {
    public static void main(String args[]) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("Ravi");
        ar.add("Ranji");
        ar.add("Ramesh");

        //System.out.println(ar);
        ar.stream()
        .filter(r->r.startsWith("Rav"))
        .forEach(r->System.out.println(r));
 
        
    }
}
