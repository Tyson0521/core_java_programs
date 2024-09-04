package StringMethods;

import java.util.Scanner;

public class CharAtMethod {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Words :");
		String s1 = scan.nextLine();
		String s2 = "";
		
		for(int i=0; i<s1.length(); i++) { //Reversing a string using charAt Method
			s2=s1.charAt(i)+s2;
		}
		System.out.println("The reveser of "+s1+" is : "+s2);
		
		for(int i=0; i<s1.length(); i++) { //individual char present in a string
			System.out.println(s1.charAt(i));
		}
	}
}
