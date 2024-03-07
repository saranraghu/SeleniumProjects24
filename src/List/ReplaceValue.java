package List;

import java.util.*;

public class ReplaceValue {
	
	public static void main(String[] args) {
		
		List<Integer> Li = new ArrayList<> ();
		System.out.println("Replace the value 300 into 350 in the list");
		Li.add(100);
		Li.add(200);
		Li.add(300);
		Li.add(400);
		Li.add(500);
		Li.add(600);
		Li.add(700);
		Li.add(800);
		System.out.println(Li);
		Li.set(2, 350);
		System.out.println(Li);
		
		System.out.println("Replace the value present in 7th index as 90");
		Li.set(7, 90);
		System.out.println(Li);
		
		System.out.println("Replace the 10 into 100 in List");
		List<Integer> Ll = new ArrayList<> ();
		Ll.add(10);
		Ll.add(20);
		Ll.add(30);
		Ll.add(90);
		Ll.add(10);
		Ll.add(10);
		Ll.add(40);
		Ll.add(50);
		Ll.add(30);
		
		
		
	}

}
