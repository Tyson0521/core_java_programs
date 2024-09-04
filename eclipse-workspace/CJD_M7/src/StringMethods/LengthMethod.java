package StringMethods;

import java.util.Scanner;

public class LengthMethod {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the characters :");
		String s = scan.nextLine();
		
		System.out.println(s.length()+" is the length of given string");
		
	}

}
