package ArrayPractice;

import java.util.Scanner;

public class CheckFibonacci {
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
		for(int i=0; i<size; i++) {
			if(checkFib(a[i])) {
				count++;
			}
		}
		
		int[] b = new int[count];
		int j=0;
		for(int i=0; i<size; i++) {
			if(checkFib(a[i])) {
				b[j++]=a[i];
			}
		}
		
		System.out.print("[ ");
		for(int i: b) {
			System.out.print(i+" ");
		}
		System.out.println("]");
		
	}
	
	public static boolean checkFib(int i) {
		int a=0;
		int b=1;
		int c=0;
		if(i==a) {
			return true;
		} else if(i==b) {
			return true;
		} else {
			while((a+b)<=i) {
				c=a+b;
				a=b;
				b=c;
			} 
		return c==i;
		}
		
	}
}
