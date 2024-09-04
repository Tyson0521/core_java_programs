package ArrayPractice;

import java.util.Scanner;

public class UniqueOddElements {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter the size of Array :");
		int size = scan.nextInt();
		int[] a= new int[size];
		for(int i=0; i<a.length; i++) {
			System.out.print("Enter the values at a["+i+"] : ");
			a[i] = scan.nextInt();
		}
		
		int[] occur = new int[a.length];
		for(int i=0; i<a.length ;i++) {
			int count=1;
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j] && a[i]%2!=0) {
					count++;
					occur[j]=1;
				}
			}
			if(occur[i]!=1 && count==1 && a[i]%2!=0) {
				System.out.println("Unique even elements are : "+a[i]);
			}
			
		}
		
		
	}

}
