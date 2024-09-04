package StringMethods;

import java.util.Scanner;

public class TrimMethod {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Words :");
		String s = scan.nextLine();
		
		//Eliminates the Spaces from left and right side of String
		System.out.println(s.trim()); 
	}

}
