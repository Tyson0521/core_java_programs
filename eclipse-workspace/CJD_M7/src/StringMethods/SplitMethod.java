package StringMethods;

import java.util.Scanner;

public class SplitMethod {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Words :");
		String s = scan.nextLine();
		
		String[] s1 = s.split(" ");//eliminates the space from given string and create diff objects
		
		for(String a : s1) {
			System.out.println(a);
		}
	}

}
