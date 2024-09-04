package set;

import java.util.TreeSet;

public class UserLogicStudent {
	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<Student>();
		ts.add(new Student("vinay", 3, 96));
		ts.add(new Student("Vijay", 1, 90));
		ts.add(new Student("Imran", 4, 76));
		ts.add(new Student("santhosh", 2, 86));
		ts.add(new Student("Manish", 5, 88));
		System.out.println(ts);
		
		
	}
}
