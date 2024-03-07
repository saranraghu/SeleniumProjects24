package List;

import java.util.*;

public class ReturnCommanValues {
	
	public static void main(String[] args) {
		System.out.println("QUESTION 10.3");
		System.out.println("Create a new ArrayListlists with values and return the common values");
		List<Integer> Li = new ArrayList<> ();
		Li.add(10);
		Li.add(20);
		Li.add(30);
		Li.add(90);
		Li.add(10);
		Li.add(10);
		Li.add(40);
		Li.add(50);
		
		List<Integer> Ll = new ArrayList<> ();
		Li.add(10);
		Li.add(20);
		Li.add(30);
		
		Ll.retainAll(Li);
		System.out.println(Ll);
	}

}
