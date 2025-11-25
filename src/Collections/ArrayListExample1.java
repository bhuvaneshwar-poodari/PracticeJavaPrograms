package Collections;

import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String args[]) {
		
		ArrayList<Object> ar = new <Object>ArrayList();
		
		ar.add("Ravi");
		ar.add("arun");
		ar.add("naveen");
		ar.add(44);
		System.out.println(ar);
		
      ar.remove(3);
      System.out.println(ar);
	}
}
