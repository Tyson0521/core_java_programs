package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class StudentsRank {
	public static void main(String[] args) {
		ArrayList<StudentsExam> s = new ArrayList<StudentsExam>();
		s.add(new StudentsExam("Vinay", 101, 93));
		s.add(new StudentsExam("Santhosh", 104,86));
		s.add(new StudentsExam("Vijay", 105, 98));
		s.add(new StudentsExam("Imran", 102, 65));
		s.add(new StudentsExam("Sahil", 103, 95));
		s.add(new StudentsExam("Sridhar", 107, 69));
		s.add(new StudentsExam("Adharsh",106, 87));
		
//		task-1-----------------------Descending order by marks-------------------------------
		System.out.println(">>>>>Before sorting<<<<<");
		System.out.println(s); 
		Collections.sort(s);
		System.out.println(">>>>>After sorting<<<<<<");
		System.out.println(s);
		
//		task-2-----------------------Assign ranks--------------------------------------------
		for(int i=0; i<s.size(); i++) {
			s.get(i).rank=i+1;
		}
		System.out.println("Ranks of Students");
		System.out.println(s);
		
//		task-3------------------------marks more >=70----------------------------------------
		ArrayList<StudentsExam> s1 = new ArrayList<StudentsExam>();
		for (StudentsExam stu : s) {
			if(stu.marks>=70) {
				s1.add(stu);
			}
		}
		System.out.println("Students scored more than 70 : ");
		System.out.println(s1);
		
//		task-4------------------------Consonants Names-----------------------------------------
		ArrayList<StudentsExam> v = new ArrayList<StudentsExam>();
		String vowels ="AEIOUaeiou";
		for (StudentsExam stu : s) {
			if(!vowels.contains(stu.name.charAt(0)+"")) {
				v.add(stu);
			}
		}
		System.out.println("Consonants Names : "+v);
		
//		task-5------------------------Prime Ranks----------------------------------------------
		ArrayList<StudentsExam> prime = new ArrayList<StudentsExam>();
		for (StudentsExam stu : s) {
			if(checkPrime(stu.rank)) {
				prime.add(stu);
			}
		}
		System.out.println("Prime ranks Students");
		System.out.println(prime);
		
	}
	
	public static boolean checkPrime(int n) {
		if(n<2) { 
			return false;
		}
		for(int i=2;i<=n/2; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
