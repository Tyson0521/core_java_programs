package ArrayPractice;

import java.util.Scanner;

public class MinMaxOfArray {
static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the size of the array : ");
		int size = scan.nextInt();
		int[] a = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter the values :");
			a[i]=scan.nextInt();
		}
		
		int max = a[0];
		int min = a[0];
		for(int value : a) {
			if(value>max) {
				max = value;
			} else if (value<min) {
				min = value;
			} 
		}
		System.out.println("The max of elements is : "+max);
		System.out.println("The min of elements is : "+min);
	}

}
