package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortingAlphabetsSS {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		char[] a = {'k','h','A','m','N','z','Z'};
		for(int i=0; i<a.length-1; i++) {
			int min=i;
			for(int j=i+1; j<a.length; j++) {
				if(a[min]>a[j]) {
					min=j;
				}
			}
			char temp = a[min];
			a[min] = a[i];
			a[i] = temp; 
		}
		
		System.out.println(Arrays.toString(a));
	}
}
