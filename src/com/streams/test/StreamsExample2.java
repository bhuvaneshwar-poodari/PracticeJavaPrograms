package com.streams.test;
import java.util.*;


public class StreamsExample2 {
	public static void main(String args[]) {
	
		ArrayList<Integer> clumsyList1 = new ArrayList<>();
        clumsyList1.add(5);
        clumsyList1.add(2);
        clumsyList1.add(8);
        clumsyList1.add(1);
        clumsyList1.add(7);
        
        clumsyList1.stream()
        .sorted()
        .map(e->"1 = "+e)
       
        .forEach(order->System.out.println(order+" "));
        
}
}
