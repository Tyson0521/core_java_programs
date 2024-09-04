package ArrayPractice;

import java.util.Scanner;

public class DistinctElements {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) { //vivek sir logic
		System.out.println("Enter the size of array :");
		int size = scan.nextInt();
		int[] a = new int[size];
		for(int i=0; i<size; i++) {
			System.out.println("Enter the values of a["+i+"]");
			a[i]=scan.nextInt();
		}
		int count=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				if(a[i]==a[j] && i==j) {
					count++;
					break;
				} 
				if(a[i]==a[j] && i>j) {
					break;
				}
			} 
		}
		
		int[] b =new int[count];
		int index=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				if(a[i]==a[j] && i==j) {
					b[index++]=a[i];
					break;
				} 
				if(a[i]==a[j] && i>j) {
					break;
				}
			} 
		}
		System.out.print("[ ");
		for(int value : b) {
			System.out.print(value+ " ");
		}
		System.out.println("]");
	}

}
