package ArrayPractice;

import java.util.Scanner;

public class MinMaxOfFirstHalf {
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
		int max=a[0];
		int min=a[0];
		for(int i=0; i<(a.length/2); i++) {
			if(a[i]>max) {
				max = a[i];
			} else if (a[i]<min) {
				min = a[i];
			} 
		}
		
//		int count=0;
//		for(int i=0; i<(a.length/2); i++) {
//			count++;
//		}
//		
//		int[] b = new int[count];
//		for(int i=0,j=0; i<(a.length/2); i++) {
//			b[j++]=a[i];
//		}
		
//		for(int value : a) {
//			if(value>max) {
//				max = value;
//			} else if (value<min) {
//				min = value;
//			} 
//		} 
		System.out.println("The max of First half elements is : "+max);
		System.out.println("The min of First half elements is : "+min);
		
	}
}
