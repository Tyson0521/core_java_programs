package Coding_Practice;

import java.util.Scanner;

public class ArrayPractice1 {
	static Scanner scan = new Scanner(System.in); 

	public static void main(String[] args) {
		System.out.println("Enter the size of the Array : ");
		int sizeOfArray = scan.nextInt();
		char specialChar[] = new char[sizeOfArray];
		
		for(int index=0;index<sizeOfArray;index++) {
			System.out.println("enter single char values: ");
			scan.nextLine();
			specialChar[index] = scan.nextLine().charAt(0);
			
		}
		
		System.out.print("[");
		for(int index=0;index<specialChar.length;index++) {
			System.out.print(specialChar[index]);
		}
		System.out.println("]");
		
	}

}
