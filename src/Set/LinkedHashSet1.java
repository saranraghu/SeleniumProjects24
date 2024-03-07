package Set;

import java.util.*;

public class LinkedHashSet1 {
	
	public static void main(String[] args) {
		
		Set<Integer> Li = new LinkedHashSet<>();
		
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
		
		System.out.println("Create a LinkedHashSet for the below values");
		System.out.println(Li);
	}

}
