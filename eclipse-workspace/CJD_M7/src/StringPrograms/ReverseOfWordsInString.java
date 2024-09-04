package StringPrograms;

import java.util.Scanner;

public class ReverseOfWordsInString {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		String s = "java html css";
		String[] s1 = s.split(" ");
		String str = "";
		
		for(int i=0; i<s1.length; i++) {
			str = str+" "+reverse(s1[i]);
		}
		System.out.println(str.trim());
	}
	
	public static String reverse(String s) {
		String rev = "";
		for(int i=0; i<s.length(); i++) {
			rev = s.charAt(i)+rev;
		}
	return rev;
	}

}
