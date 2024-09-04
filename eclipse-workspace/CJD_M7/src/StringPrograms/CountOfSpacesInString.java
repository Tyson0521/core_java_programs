package StringPrograms;

import java.util.Scanner;

public class CountOfSpacesInString {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		String s = scan.nextLine();
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==32) {
				count++;
			}
		}
		System.out.println("No of Spaces are : "+count);
	}
	

}
