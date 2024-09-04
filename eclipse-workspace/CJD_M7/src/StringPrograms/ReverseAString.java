package StringPrograms;

import java.util.Scanner;

public class ReverseAString {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the Words :");
		String s1 = scan.nextLine();
		String s2 = "";
		
		for(int i=0; i<s1.length(); i++) {
			s2=s1.charAt(i)+s2;
		}
		
		System.out.println(s2);
		
	}
}
