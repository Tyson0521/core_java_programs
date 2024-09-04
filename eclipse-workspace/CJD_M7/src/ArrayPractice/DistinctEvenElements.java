package ArrayPractice;

import java.util.Scanner;

public class DistinctEvenElements {
static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		int size = scan.nextInt();
		int[] a = new int[size];
		for(int i=0; i<size; i++) {
			System.out.println("Enter the values of a["+i+"]");
			a[i]=scan.nextInt();
		}
		int count=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				if(a[i]==a[j] && i==j && a[i]%2==0) {
					count++;
					break;
				} 
				if(a[i]==a[j] && i>j) {
					break;
				}
			} 
		}
		
		if(count==0) {
			System.out.println("There are no Even Elements");
		} else {
			int[] b =new int[count];
			int index=0;
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a.length; j++) {
					if(a[i]==a[j] && i==j && a[i]%2==0) {
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

}
