package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class FirstEvenLastOdd {
	
	static Scanner scan= new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the size of array:");
		int size = scan.nextInt();
		int[] a = new int[size];
		
		for(int i=0; i<a.length; i++) {
			System.out.println("Enter the values of a["+i+"]");
			a[i]=scan.nextInt();
		}
		
		//int a[] = {5,2,4,7,6,3,8};
		int b[] = new int[a.length];
		
		int k = 0;
		for(int i : a) {
			if(i%2==0) {
				b[k++]=i;
			}
		}
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2!=0) {
				b[k++]= a[i];
			}
		}
		System.out.println(Arrays.toString(b));
	}

}
