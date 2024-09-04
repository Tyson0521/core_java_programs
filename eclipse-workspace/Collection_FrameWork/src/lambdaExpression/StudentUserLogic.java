package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentUserLogic {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Student> al= new ArrayList<Student>();
		al.add(new Student("Vinay", 1, "CSE", 68));
		al.add(new Student("Santhosh", 2, "CSE", 95));
		al.add(new Student("Vijay", 3, "IT", 85));
		al.add(new Student("Imran", 4, "B.Com", 74));
		al.add(new Student("Manish", 5, "EEE", 80));
		System.out.println(">>>>>>>>>>>before sorting<<<<<<<<<<");
		System.out.println(al);
		
		Comparator<Student> c = (Student s1 , Student s2)->{
			if(s1.rollno>s2.rollno) 
				return 1;
			else if(s1.rollno<s2.rollno)
				return -1;
			
			return 0 ;
		};
		
		System.out.println("Choose the property Number to compare: \n1.Name \n2.Rollno \n3.Branch \n4.Marks");
		String userChoice = scan.next(); 
		if(userChoice.equals("1")) {
			c = (Student s1 , Student s2)->{
				return s1.name.compareTo(s2.name);
			};
		}
		else if(userChoice.equals("2")) {
			 c = (Student s1 , Student s2)->{
				if(s1.rollno>s2.rollno)
					return 1;
				else if(s1.rollno<s2.rollno)
					return -1;
				
				return 0 ;
			};
		} 
		else if(userChoice.equals("3")) {
			 c = (Student s1 , Student s2)->{
				return s1.branch.compareTo(s2.branch);
			};

		}
		else if(userChoice.equals("4")) {
			c = (Student s1 , Student s2)->{
				if(s1.marks>s2.marks)
					return -1;
				else if(s1.marks<s2.marks)
					return 1;
				
				return 0 ;
			};
		}
		
		Collections.sort(al, c);
		System.out.println(">>>>>>>>>>> sorting according to user choice property <<<<<<<<<");
		System.out.println(al);
		
	}
}
