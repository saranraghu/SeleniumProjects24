package Map;

import java.util.*;
import java.util.Map.Entry;

public class HashMap1 {
	
	public static void main(String[] args) {
		
		
		Map<Integer , String> Li = new HashMap<>();
		
		Li.put(10, "Java");
		Li.put(20, "SQL");
		Li.put(30, "OOPS");
		Li.put(40, "SQL");
		Li.put(50, "ORACLE");
		Li.put(60, "DB");
		Li.put(10, "Selenium");
		Li.put(50, "PSQL");
		
		System.out.println("Create a HashMap with the below key and values");
		System.out.println(Li);
		System.out.println();
		
		System.out.println("HashMap get(print) the key only in the map");
		Set<Integer> keySet = Li.keySet();
		System.out.println(keySet);
		System.out.println();
		
		System.out.println("Create a HashMap get(print) the values only in the map");
		Collection<String> values = Li.values();
		System.out.println(values);
		System.out.println();
		
		System.out.println("Create a HashMap iterate it using enhanced for loop");
		Set<Entry<Integer, String>> Ll = Li.entrySet();
		System.out.println(Ll);
		
//		for(Entry<Integer,String> L:Ll) {
//		System.out.println(L);
//		System.out.println();
		
		System.out.println("iterate it using enhanced for loop and get the key and values");
		for(Entry<Integer,String> Le:Ll) {
		System.out.println(Le.getKey());
		System.out.println(Le.getValue());
		}
	}
	}

