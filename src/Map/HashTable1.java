package Map;

import java.util.*;

public class HashTable1 {
	
	public static void main(String[] args) {
		
		Map<String , String> Li = new Hashtable<> ();
		
		Li.put("ABC", "Java");
		Li.put("ABD", "Selenium");
		Li.put("ABE", "C++");
		Li.put("ABF", "Phyton");
		Li.put("ABG", "C");
		Li.put("ABH", "Ruby");
		Li.put("ABI", "Oracle");
		
		System.out.println(Li);
	}

}
