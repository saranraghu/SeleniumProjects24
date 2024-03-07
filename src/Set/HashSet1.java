package Set;

import java.util.*;

public class HashSet1 {
	
	public static void main(String[] args) {
		
		Set<Integer> Li = new HashSet<>();
		Li.add(10);
		Li.add(20);
		Li.add(30);
		Li.add(40);
		Li.add(50);
		Li.add(60);
		Li.add(70);
		Li.add(80);
		Li.add(90);
		Li.add(10);
		Li.add(20);
		
		System.out.println("Create a HashSet for the below values");
		System.out.println(Li);
		
		System.out.println("Convert the below list in to set(use addAll()) method");
		List<Integer> Ll = new ArrayList<> ();
		Ll.add(10);
		Ll.add(20);
		Ll.add(30);
		Ll.add(40);
		Ll.add(50);
		Ll.add(60);
		Ll.add(70);
		Ll.add(80);
		Ll.add(90);
		Ll.add(10);
		Ll.add(20);
	}

}
