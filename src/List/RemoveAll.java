package List;

import java.util.*;

public class RemoveAll {
	
	public static void main(String[] args) {
		
		List <Integer> Li = new ArrayList<> ();
		
		Li.add(10);
		Li.add(20);
		Li.add(30);
		Li.add(90);
		Li.add(10);
		Li.add(10);
		Li.add(40);
		Li.add(50);
		
		List<Integer> Ll = new ArrayList<> ();
		Ll.add(30);
		Ll.add(40);
		Ll.add(50);
		Ll.add(60);
		Ll.add(80);
		
		Li.removeAll(Ll);
		System.out.println("Create a ArrayListlists and perform removeAll() function");
		System.out.println(Li);
		
		
		
	}

}
