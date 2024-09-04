package set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(50);
		ts.add(10);
//		ts.add(25.5);
		ts.add(20);
		ts.add(40);
		ts.add(60);
		System.out.println(ts);
		
		System.out.println(">>>>>Iterator normal Ascending<<<<<<<<<<");
		Iterator<Integer> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		--------------------descending Order method---------------------
		System.out.println(">>>>>Iterator Descending Order<<<<<<<");
		Iterator<Integer> dtr = ts.descendingIterator();
		while (dtr.hasNext()) {
			System.out.println(dtr.next());
		}
		
//		---------------------methods------------------------------------
		System.out.println("ceiling: "+ts.ceiling(10));//including itself
		System.out.println("ceiling: "+ts.ceiling(13));//if not next highest value
		System.out.println("floor: "+ts.floor(40));//including itself
		System.out.println("floor: "+ts.floor(35));//if not previous lower value
		System.out.println("first: "+ts.first());
		System.out.println("last: "+ts.last());
		System.out.println("higher: "+ts.higher(40));//excluding itself
		System.out.println("lower: "+ts.lower(50));//excluding itself
//		System.out.println("pollFirst: "+ts.pollFirst());//remove first element
		System.out.println(ts);
//		System.out.println("pollLast: "+ts.pollLast());//remove last element
		System.out.println("sub set: "+ts.subSet(10, 60));//including first but excluding last
		System.out.println("tail set: "+ts.tailSet(20));//including itself
		System.out.println("tailset over: "+ts.tailSet(20, true));
		System.out.println("head set: "+ts.headSet(50));//excluding itself 
		System.out.println("head set over: "+ts.headSet(30, false));
		
		
	}
}
