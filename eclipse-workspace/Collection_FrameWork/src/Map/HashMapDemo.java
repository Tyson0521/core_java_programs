package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<>();
		h.put(101, "virat");
		h.put(103, "sai");
		h.put(102, "rcb");
		h.put(105, "chandrababu");
		h.put(104, "pawan");
		System.out.println(h);
		
		System.out.println(">>>>Accessing only Key object in map<<<<");
		for (Integer i : h.keySet()) {
			System.out.println(i);
		}
		
		System.out.println(">>>>Accessing only Value object in map<<<<");
		for(String s : h.values()) {
			System.out.println(s);
		}
		
		System.out.println(">>>>Accessing through entrySet()<<<<");
		for(Object o : h.entrySet()) {
			System.out.println(o);
		}
		
		Set c1 = h.entrySet();
		System.out.println(c1);
		System.out.println(">>>>Converting to collection and through iterator<<<<");
		Iterator itr1 = c1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		Set c2 = h.keySet();
		System.out.println(c2);
		System.out.println(">>>>Key object by using Iterator<<<<");
		Iterator itr2 = c2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		Collection c3 = h.values();
		System.out.println(c3);
		System.out.println(">>>>Values object by using Iterator<<<<");
		Iterator itr3 = c3.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		
	}
}
