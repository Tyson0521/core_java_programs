package ArrayPractice;

import java.util.Scanner;

public class AlphabetCount {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of the Array :");
		int size = scan.nextInt();
		char[] a = new char[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter the char for array["+i+"]");
			scan.nextLine();
			a[i]= scan.nextLine().charAt(0);
		}
		
		System.out.print("[");
		for(char value : a) {
			System.out.print(value);
		}
		System.out.println("]");
		
		
		
		int c1=0, c2=0, c3=0, c4=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]>='A' && a[i]<='Z' ) {
				c1++;
			} else if(a[i]>='a' && a[i]<='z') {
				c2++;
			} else if(a[i]>='0' && a[i]<='9') {
				c3++;
			} else {
				c4++;
			}
		}
		
		System.out.println("The Number of Upper Case alphabets are : "+c1);
		System.out.println("The Number of Lower Case alphabets are : "+c2);
		System.out.println("The Number of Numeric Characters are : "+c3);
		System.out.println("The Number of Special Characters are : "+c4);
	}
	

}
