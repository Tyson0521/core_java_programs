package ArrayPractice;

import java.util.Scanner;

public class SumOfFirstHalf {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the array : ");
		int size = scan.nextInt();
		int[] a = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter the values :");
			a[i]=scan.nextInt();
		}
		
		int sum=0;
		for(int i=0; i<(a.length/2); i++) {
			sum=sum+a[i];
		}
		System.out.println("The sum of First half elements is :"+sum);
		
	}
}

