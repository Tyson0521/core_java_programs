package Collection;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.List; 

public class BikeRider { 
	public static void main(String[] args) {
		ArrayList<Bike> al = new ArrayList<Bike>();
		al.add(new Bike("Rx100", 85000, 95, 45));
		al.add(new Bike("Classic", 255000, 120, 35));
		al.add(new Bike("Yamaha Fz",220000, 142, 38));
		al.add(new Bike("Apache", 185000, 135, 40));
		al.add(new Bike("Splender", 195000, 125, 42));
		System.out.println(al);
		 
		//sorting with price property
		Collections.sort(al);
		System.out.println(al);
		
		List<Integer> l = new ArrayList<Integer>(); 
		l.add(10);
		l.add(20); 
		l.add(30);
		l.add(10);
		l.add(40);
		l.add(50);
//		l.add(30.4);
//		System.out.println(l);
//		 
//		System.out.println(">>>>>>>By using get() and for loop<<<<<<<");
//		for(int i=0; i<l.size(); i++) {
//			System.out.println(l.get(i));
//		}
//		
//		System.out.println(">>>>>>>By using for-each loop<<<<<<<");
//		for(Object o : l) {
//			System.out.println(o);
//		}
		
		
		
		
	}
}
