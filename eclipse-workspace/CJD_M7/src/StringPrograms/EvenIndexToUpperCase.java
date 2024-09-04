package StringPrograms;

import java.util.Scanner;

public class EvenIndexToUpperCase {
	static Scanner scan = new Scanner(System.in); 

	public static void main(String[] args) {
		System.out.println("Enter The String :");
		String s = scan.nextLine();
		String str = "";
		
		for(int i=0; i<s.length(); i++){
			if(i%2!=0) {
				str = str + s.charAt(i);
			} else {
				str = str + (char)(s.charAt(i)-32);
			}
		}
		System.out.println("convert String at even index : "+str);
	}

}
