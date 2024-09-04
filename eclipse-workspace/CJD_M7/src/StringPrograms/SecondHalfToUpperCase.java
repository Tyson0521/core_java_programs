package StringPrograms;

import java.util.Scanner;

public class SecondHalfToUpperCase {
	static Scanner scan = new Scanner(System.in); 
	
	public static void main(String[] args) {
		System.out.println("Enter The String :");
		String s = scan.nextLine();
		String str = "";
		
		for(int i=0; i<s.length(); i++){
			if(i<s.length()/2) {
				str = str + s.charAt(i);
			} else {
				str = str + (char)(s.charAt(i)-32);
			}
		}
		System.out.println("The converted 2nd Half String is : "+str);
	}
}
