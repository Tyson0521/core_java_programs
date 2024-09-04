package StringMethods;

import java.util.Arrays;
import java.util.Scanner;

public class ToCharArrayMethod {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the Words :");
		String s = scan.nextLine();
		
		char[] ch = s.toCharArray();
		System.out.print("The char Array of given String is : ");
		System.out.println(Arrays.toString(ch));
		
		String s1 = new String(ch);
		System.out.println("The string created from char array is : "+s1);

	}

}
