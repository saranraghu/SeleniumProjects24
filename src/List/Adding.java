package List;

import java.util.*;

public class Adding {
	
	public static void main(String[] args) {
		
		System.out.println("Add a value 50 in the 2nd index and display the list after adding");
		List<Integer> Li = new ArrayList<> ();
		Li.add(10);
		Li.add(20);
		Li.add(30);
		Li.add(90);
		Li.add(10);
		Li.add(10);
		Li.add(40);
		Li.add(50);
		System.out.println(Li);
		Li.add(2, 50);
		System.out.println("Added the value 50 in 2nd index "+Li);
		
		System.out.println("Add a value 70 at the end of the list");
		System.out.println(Li);
		Li.add(70);
		System.out.println(Li);
		
		System.out.println("Add a value 80 at the 8th index of list");
		Li.add(8, 80);
		System.out.println(Li);
		
		System.out.println("Add a value 100 at the last index of 10 in the list");
		Li.set(6, 100);
		System.out.println(Li);
		
		
	}

}
