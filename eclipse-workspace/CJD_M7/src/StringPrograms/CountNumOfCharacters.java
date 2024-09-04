package StringPrograms;

import java.util.Scanner;

public class CountNumOfCharacters {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the words :");
		String s = scan.nextLine();
		
		int countUpper=0, countLower=0, countNum=0, countSpl=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				countUpper++;
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				countLower++;
			} 
			else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				countNum++;
			}
			else {
				countSpl++; 
			}
		}
		
		System.out.println("The Num of Lower Case alphabets are : "+countLower);
		System.out.println("The Num of Upper Case alphabets are : "+countUpper);
		System.out.println("The Num of Digits are : "+countNum);
		System.out.println("The Num of Special Characters are : "+countSpl);
	}

}
