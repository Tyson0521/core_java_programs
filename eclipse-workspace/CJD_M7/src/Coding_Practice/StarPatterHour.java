package Coding_Practice;

import java.util.Scanner;

public class StarPatterHour {
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		star();
	}
	
	public static void star() {
//		System.out.print("Num of row :");
//		int row = sc.nextInt();
//		System.out.print("Num of Stars in a row :");
//		int star=sc.nextInt();
//		System.out.print("Spaces :");
//		int space = sc.nextInt();
		
		int space=-1, star=6, row=9;
		for(int i =1 ;i<=row;i++) {
			if(i<=5) {
				space++;
				star--;
			} else {
				space--;
				star++;
			}
			for(int k=1;k<=space;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
		System.out.println();
		}
	}
	
}
