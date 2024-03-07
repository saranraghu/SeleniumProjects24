package List;

import java.util.*;

public class RemoveValue {
	
	public static void main(String[] args) {
		
		System.out.println("Remove the value present at 2nd index");
		List<Integer> Li = new ArrayList<> ();
		Li.add(10);
		Li.add(20);
		Li.add(30);
		Li.add(40);
		Li.add(50);
		Li.add(60);
		System.out.println(Li);
		System.out.println("Removed the 2nd Index " +Li.remove(2));
		System.out.println(Li);
		
		System.out.println("Remove the value present at 10th index");
		Li.add(10);
		Li.add(40);
		Li.add(20);
		Li.add(30);
		Li.add(40);
		Li.add(50);
		System.out.println(Li);
		System.out.println("Removing the 10th Index "+Li.remove(10));
		System.out.println(Li);
		
		
		
		
		
	}

}
