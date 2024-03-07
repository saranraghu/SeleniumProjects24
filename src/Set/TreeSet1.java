package Set;

import java.util.*;

public class TreeSet1 {
	
	public static void main(String[] args) {
		
		Set<Integer> Ll = new TreeSet<> ();	
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
		
		System.out.println("Create a TreeSet for the below values");
		System.out.println(Ll);
	}

}
