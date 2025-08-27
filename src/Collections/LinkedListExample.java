package Collections;
import java.util.*;

public class LinkedListExample {

	public static void main(String args[]) {
		LinkedList<Object> ls = new LinkedList();
		
		ls.add("bhuvi");
		ls.add("Rambo");
		ls.add(1);
		ls.add(5);
		System.out.println(ls);
		System.out.println(ls.get(3));
	}
}
