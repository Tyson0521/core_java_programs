package StringMethods;

import java.util.Scanner;

public class ToLowerCaseMethod {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Words :");
		String s = scan.nextLine();
		
		System.out.println("The lower case format : "+s.toLowerCase());
	}

}