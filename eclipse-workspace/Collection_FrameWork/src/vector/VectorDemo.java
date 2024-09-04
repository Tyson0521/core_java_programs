package vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		Vector<Car> v = new Vector<Car>();
		v.add(new Car("Toyota", 120.4, 12.5));
		v.add(new Car("BMW", 180.3, 8.3));
		v.add(new Car("Tata", 110.8, 22.9));
		v.add(new Car("Honda", 120.9, 18.5));
		System.out.println(v);
		
		System.out.println("-----------by using for each loop-----------");
		for(Object o : v) {
			System.out.println(o);
		}
		
		System.out.println("----------by using Iterator interface---------");
		Iterator<Car> itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("----------by using List Iterstor interface------");
		ListIterator<Car> ltr = v.listIterator();
		while (ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		
		System.out.println("-----------by using Enumeration---------------");
		Enumeration<Car> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}
}
