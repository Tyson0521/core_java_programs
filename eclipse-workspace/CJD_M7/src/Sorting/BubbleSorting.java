package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSorting {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] a = {7,3,2,5,6,1};
		
		//comparing every adjacent elements and swaping them
		for(int i=0; i<a.length-1; i++){
			for(int j=0; j<a.length-i-1; j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		//by using j=0 and condition till n-i-1
//		for(int i=0; i<a.length-1; i++){
//			for(int j=0; j<a.length-i-1; j++) {
//				if(a[j]>a[j+1]) {
//					int temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//				}
//			}
//		}
		System.out.println(Arrays.toString(a));
		
	}
}
