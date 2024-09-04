package StringPrograms;

import java.util.Scanner;

public class CheckPalindrome {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the Words :");
		String s = scan.nextLine();
		if(checkPalindrome(s)) {
			System.out.println(s+" is a Palindrome");
		} else {
			System.out.println(s+" is not a Palindrome");
		}
		
	}
	
	public static boolean checkPalindrome(String s) {
		String s1="";
		for(int i=0; i<s.length(); i++) {
			s1=s.charAt(i)+s1;
		}
		return s1.equalsIgnoreCase(s);
	}
	

}
