package StringMethods;

import java.util.Scanner;

public class SubStringMethod {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Words :");
		String s = scan.nextLine();
		
		//subString is a OverLoaded Method
		System.out.println(s.substring(5));
		//System.out.println(s.substring(12));
		System.out.println(s.substring(6, 7));
		System.out.println(s.substring(6, 8));
		System.out.println(s.substring(9));
		System.out.println(s.substring(0));
		System.out.println(s.substring(5, 5));
	}

}
