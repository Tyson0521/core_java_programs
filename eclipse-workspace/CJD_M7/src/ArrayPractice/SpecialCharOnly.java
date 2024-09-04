package ArrayPractice;

import java.util.Scanner;

public class SpecialCharOnly {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of the Array :");
		int size = scan.nextInt();
		char[] a = new char[size];
		
		char ch1='A';
		for(int i=0; i<size; i++) {
			//System.out.println("Enter the characters for a["+i+"]");
			while(ch1>='A' && ch1<='Z' || ch1>='a' && ch1<='z' || ch1>='0' && ch1<='9' ) {
				System.out.println("Enter only Special char :");
				scan.nextLine();
				ch1=scan.nextLine().charAt(0);
			}
			a[i]=ch1;
			ch1='A';
		}
		
		System.out.print("[");
		for(char value : a) {
			System.out.print(value);
		}
		System.out.println("]");
		
	}
}
