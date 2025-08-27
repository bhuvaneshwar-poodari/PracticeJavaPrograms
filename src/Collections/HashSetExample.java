package Collections;
import java.util.*;
import java.util.NavigableSet;

public class HashSetExample {
public static void main(String args[]) {
	HashSet<Object> hs = new HashSet<>();
	
	hs.add("ravi");
	hs.add(null);

	

	hs.add("ravi");
	System.out.println(hs);
}
}
