package ArrayPractice;

import java.util.Scanner;

public class MinMaxOfEvenElements {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the size of the array : ");
		int size = scan.nextInt();
		int[] a = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter the values :");
			a[i]=scan.nextInt();
		}
		
		int count=0;
		for(int i : a) {
			if(i%2==0) {
				count++;
			}
		}
		int[] b = new int[count];
		int j=0;
		for(int i=0; i<size; i++) {
			if(a[i]%2==0) {
				b[j++]=a[i];
			}
		}
		
		int max = b[0];
		int min = b[0];
		for(int value : b) {
			if(value>max) {
				max = value;
			} else if (value<min) {
				min = value;
			} 
		} 
		System.out.println("The max of Even elements is : "+max);
		System.out.println("The min of Even elements is : "+min);
		
	}

}
