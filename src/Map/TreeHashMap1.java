package Map;

import java.util.*;
import java.util.Map.Entry;

public class TreeHashMap1 {
	
	public static void main(String[] args) {
		
		Map<Character , Integer> Li = new TreeMap<>();
		
		Li.put('!', 10);
		Li.put('@', 20);
		Li.put('#', 30);
		Li.put('$', 40);
		Li.put('%', 50);
		Li.put('^', 60);
		Li.put('&', 70);
		
		System.out.println(Li);
		
		System.out.println("TreeMap get(print) the key only in the map");
		Set<Character> keySet = Li.keySet();
		System.out.println(keySet);
		System.out.println();
		
		System.out.println("Create a TreeMap get(print) the values only in the map");
		Collection<Integer> values = Li.values();
		System.out.println(values);
		System.out.println();
		
		System.out.println("Create a TreeMap iterate it using enhanced for loop");
		Set<Entry<Character, Integer>> Ll = Li.entrySet();
		System.out.println(Ll);
		
//		for(Entry<Integer,String> L:Ll) {
//		System.out.println(L);
//		System.out.println();
		
		System.out.println("iterate it using enhanced for loop and get the key and values");
		for(Entry<Character,Integer> Le:Ll) {
		System.out.println(Le.getKey());
		System.out.println(Le.getValue());
		
		}
		
	}	

}
