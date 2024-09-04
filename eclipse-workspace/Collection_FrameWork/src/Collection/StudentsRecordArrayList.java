package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class StudentsRecordArrayList {
	public static void main(String[] args) {
		ArrayList<StudentsDetails> al= new ArrayList<StudentsDetails>();
		al.add(new StudentsDetails("Vinay", 1, "CSE", 68));
		al.add(new StudentsDetails("Santhosh", 2, "CSE", 95));
		al.add(new StudentsDetails("Vijay", 3, "IT", 85));
		al.add(new StudentsDetails("Imran", 4, "B.Com", 74));
		al.add(new StudentsDetails("Manish", 5, "EEE", 80));
		
//		System.out.println(al);
		
//		System.out.println("***By using Iterator***");
//		Iterator i = al.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		
//		System.out.println("***By using ListIterator***");
//		ListIterator li = al.listIterator();
//		while(li.hasNext()) {
//			System.out.println(li.next());
//		}
//		
//		System.out.println("**By using ListIterator Backward Direction***");
//		while(li.hasPrevious()) {
//			System.out.println(li.previous());
//		}
//		
//		System.out.println("***By using Direct backward Direction***");
//		ListIterator li2 = al.listIterator(al.size());
//		while(li2.hasPrevious()) {
//			System.out.println(li2.previous());
//		}
		

		
		//Finding average marks of the students
		int avg = 0;
		int sum =0;
		for (StudentsDetails s : al) {
			 sum = sum + s.marks;
		}
		avg = sum/al.size();
		System.out.println("The average marks of Students is : " +avg);
		
		
		//Students who scored more than average marks
		ArrayList<StudentsDetails> topper = new ArrayList<StudentsDetails>();
		for (StudentsDetails s : al) {
			if(s.marks>avg) {
				topper.add(s);
			}
		}
		System.out.println(">>>>>Topper in the class are<<<<<");
		System.out.println(topper);
		
		
		//Students names starting with Vowels
		ArrayList<StudentsDetails> vowels = new ArrayList<StudentsDetails>();
		String v = "AEIOUaeiou";
		for (StudentsDetails s : al) {
			if(v.contains(s.name.charAt(0)+"")) {
				vowels.add(s);
			}
		}
		System.out.println(">>>>>Students With Vowels Name<<<<<");
		System.out.println(vowels);
		
		
		//Highest score among the students
		System.out.println(">>>>>Highest Marks are to<<<<<");
		Integer top = 0;
		Integer topIndex = 0;
		for(int i=0; i<al.size(); i++) {
			if(al.get(i).marks>top) {
				top = al.get(i).marks;
				topIndex = i;
			}
		}
		System.out.println(al.get(topIndex));
		
		
	}
}
