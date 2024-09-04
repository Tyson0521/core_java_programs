package ArrayPractice;

import java.util.Scanner;

public class SumOfEvenElements {
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
		
		int sum=0;
		for(int i: b) {
			sum=sum+i;
		}
		System.out.println("The sum of even Element is : "+sum);
	}

}
