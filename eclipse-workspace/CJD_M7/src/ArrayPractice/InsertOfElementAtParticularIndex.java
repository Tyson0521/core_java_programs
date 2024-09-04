package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class InsertOfElementAtParticularIndex {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the size of array : ");
		int size = scan.nextInt();
		int[] a = new int[size];
		for(int i=0; i<a.length; i++) {
			System.out.println("Enter the element at a["+i+"]");
			a[i]=scan.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Enter the index where element is added : ");
		int index = scan.nextInt();
		System.out.println("Enter the element which you want to add at "+index+" position : ");
		int ele = scan.nextInt();
		
		int[] b = new int[size+1];
		for(int i=0,j=0; i<b.length; i++,j++) {
			if(i==index) {
				b[i]=ele;
				j--;
			} 
			else {
				 b[i]=a[j];
			}
		}
			
		System.out.println(Arrays.toString(b));
	}
}
