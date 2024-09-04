package ArrayPractice;

import java.util.Scanner;

public class MinMaxOfSecondHalf {
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
		
		int max = a[(a.length/2)];
		int min = a[(a.length/2)];
		for(int i=(a.length/2); i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			} else if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println("The max of Second half elements is : "+max);
		System.out.println("The min of Second half elements is : "+min);
		
		
	}
}
