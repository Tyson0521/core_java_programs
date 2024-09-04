package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of array:");
		int size = scan.nextInt();
		int[] a = new int[size];
		
		for(int i=0; i<a.length; i++) {
			System.out.println("Enter the values of a["+i+"]");
			a[i]=scan.nextInt();
		}
		
		System.out.println("Enter the value from which rotation starts:");
		int n = scan.nextInt();
		int[] b = new int[size];
		
		n=n%a.length;
		//int k=a.length-n;
		int k=n;
		for(int i=0; i<a.length; i++) {
			b[i]=a[k++];	
			if(k==a.length) {
				k=0; 
			} 
			
		}
		System.out.println(Arrays.toString(b));
	}
}
