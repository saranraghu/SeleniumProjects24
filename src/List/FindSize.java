package List;

import java.util.*;

public class FindSize {
	
	public static void main(String[] args) {
		
		System.out.println("ArrayList with values and find the length");
		List<Integer> L = new ArrayList<>();		
		L.add(10);
		L.add(20);
		L.add(30);
		L.add(90);
		L.add(10);
		L.add(10);
		L.add(40);
		L.add(50);
		System.out.println(L);
		System.out.println("Length of the L is "+L.size());
		
		System.out.println("LinkedList with values and find the length");
		List<Integer> Al = new LinkedList<>();
		Al.add(100);
		Al.add(200);
		Al.add(300);
		Al.add(400);
		Al.add(500);
		Al.add(600);
		Al.add(700);
		System.out.println(Al);
		System.out.println("Length of the Lilist is "+Al.size());
		
		System.out.println("vectorList with values and find the length");
		List<Integer> Vl = new Vector<>();
		Vl.add(105);
		Vl.add(205);
		Vl.add(305);
		Vl.add(405);
		Vl.add(505);
		Vl.add(605);
		Vl.add(705);
		Vl.add(805);
		System.out.println(Vl);
		System.out.println("Length of the VLlist is "+Vl.size());
		
		
		
		
		
		
	}
	
	
	

}
