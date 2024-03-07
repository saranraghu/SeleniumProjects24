package List;

import java.util.*;

public class FindIndex {
	
	public static void main(String[] args) {
		
		System.out.println("Get the first index value of 10");
		List<Integer> L = new LinkedList<> ();
		L.add(10);
		L.add(20);
		L.add(30);
		L.add(90);
		L.add(10);
		L.add(10);
		L.add(40);
		L.add(50);
		System.out.println(L);
		//System.out.println("Index value of 10 is " +L.indexOf(10));
		
		System.out.println("Each index value of 10 present in below list");
		for(int i=0;i<L.size();i++) {
			if(L.get(i)==10) {
				System.out.println(i);
			}
		
//		System.out.println("Get the last index value of 10");
//		
//		System.out.println(L);
//		System.out.println("Last index value of 10 is " +L.lastIndexOf(10));
//		
//		System.out.println("---Get the index value of 50----");
//		System.out.println(L);
//		System.out.println("Index value of 50 is "+L.indexOf(50));
//		
//		System.out.println("----Get the index value of 90---");
//		System.out.println(L);
//		System.out.println("Index value of 90 is "+L.indexOf(90));
//		
//		System.out.println("-----Get the each index value of 70 present--");
//		System.out.println(L);
//		System.out.println("Index value of 70 is "+L.indexOf(70));
//		
		
		}
		
		
		
	}

}
