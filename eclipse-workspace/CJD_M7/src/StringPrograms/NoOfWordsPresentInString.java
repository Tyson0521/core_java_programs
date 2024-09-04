package StringPrograms;

import java.util.Scanner;

public class NoOfWordsPresentInString {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		String s = scan.nextLine();
		String s1 = s.trim();
		int count = 1;
		
		for(int i=0; i<s1.length()-1; i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				count++;
			} 
		} 
		System.out.println(count);
		
	}

}
