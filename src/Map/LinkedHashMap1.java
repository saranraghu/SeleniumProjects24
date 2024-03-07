package Map;

import java.util.*;
import java.util.Map.Entry;

public class LinkedHashMap1 {
	
	public static void main(String[] args) {
		

		Map<Integer , Integer> Li = new LinkedHashMap<>();
		
		Li.put(10, 10);
		Li.put(20, 20);
		Li.put(30, 30);
		Li.put(40, 40);
		Li.put(50, 50);
		Li.put(60, 60);
		Li.put(10, 10);
		Li.put(50, 50);
		
		System.out.println("Create a LinkedHashMap with the below key and values");
		System.out.println(Li);
		
		System.out.println("LinkedHashMap and get(print) the key only in the map");
		Set<Integer> keySet = Li.keySet();
		System.out.println(keySet);
		System.out.println();
		
		System.out.println("LinkedHashMap and get(print) the values only in the map");
		Collection<Integer> values = Li.values();
		System.out.println(values);
		System.out.println();
		
		System.out.println("LinkedHashMap and iterate it using enhanced for loop");
		Set<Entry<Integer, Integer>> Ll = Li.entrySet();
		System.out.println(Ll);
		
		System.out.println("iterate it using enhanced for loop and get the key and values");
		for(Entry<Integer,Integer> Le:Ll) {
		System.out.println(Le.getKey());
		System.out.println(Le.getValue());
		
		
		}
		
	}

}
