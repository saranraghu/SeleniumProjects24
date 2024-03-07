package List;

import java.util.*;

public class GetValue {
	
	public static void main(String[] args) {		
		System.out.println("Get the value present at 2nd index");
		List<Integer> L = new LinkedList<> ();
		L.add(10);
		L.add(20);
		L.add(30);
		L.add(40);
		L.add(50);
		L.add(60);		
		System.out.println("2nd index value "+L.get(2));
		
		System.out.println("Get the value present at 4th index");
		List<Integer> L1 = new ArrayList<> ();
		L1.add(100);
		L1.add(200);
		L1.add(300);
		L1.add(400);
		L1.add(500);
		L1.add(600);
		L1.add(700);
		System.out.println("4th index value "+L1.get(4));
		
		System.out.println("Get the value present at 8th index");
		List<Integer> LE = new ArrayList<> ();
		LE.add(105);
		LE.add(205);
		LE.add(305);
		LE.add(405);
		LE.add(505);
		LE.add(605);
		LE.add(705);
		LE.add(805);		
		System.out.println("7th index value "+LE.get(7));
		
		System.out.println("Get the each value of list by using normal for loop");		
		for(int i=0;i<LE.size();i++){		
			System.out.println(LE.get(i));
		}		
		System.out.println("Get the each value of list by using enhanced for loop");
		for(int Li:LE){
			System.out.println(Li);
			
		}
		
	}

}
