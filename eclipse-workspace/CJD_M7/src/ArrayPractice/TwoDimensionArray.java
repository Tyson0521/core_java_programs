package ArrayPractice;

import java.util.Scanner;

public class TwoDimensionArray {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the Row size of 2D array :");
		int rS=scan.nextInt();
		System.out.println("Enter the Column size of 2D array :");
		int cS=scan.nextInt();
		int[][] a= new int[rS][cS];
		
		for(int i=0; i<rS;i++) {
			for(int j=0; j<cS; j++) {
				System.out.println("Enter the values of a["+i+"]"+"["+j+"]");
				a[i][j] = scan.nextInt();
			}
		}
		
		//printing
		for(int i=0; i<rS;i++) {
			for(int j=0; j<cS; j++) {
				System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
		
		System.out.println("Printing by using for each loop");
		for(int[] i : a) {
			for(int j : i) {
				System.out.print(j+" ");
			}
		System.out.println();
		}
		
	}
}
