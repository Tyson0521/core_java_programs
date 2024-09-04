package ArrayPractice;

import java.util.Scanner;

public class DuplicatePrimeElements {
static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
//		System.out.print("Enter the size of Array :");
//		int size = scan.nextInt();
//		int[] a= new int[size];
//		for(int i=0; i<a.length; i++) {
//			System.out.print("Enter the values at a["+i+"] : ");
//			a[i] = scan.nextInt();
//		}
		int[] a = {0,2,3,5,8,1,4,7,0,2,3,6,9,6,5,8};
		int[] occur = new int[a.length];
		
		for(int i=0; i<a.length ;i++) {  //Pavan sir logic
			int count=1;
			for(int j=i+1; j<a.length; j++) {
				if(checkPrime(a[i])==checkPrime(a[j])) {
					count++;
					occur[j]=1; 
				}
			}
			if(occur[i]!=1 && count>1 && checkPrime(a[i])) {
				System.out.println("Duplicate Prime elements are : "+a[i]);
			}
		}
	}
	
	public static boolean checkPrime(int n) {
		if(n<2) {
			return false;
		} 
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				return false;
			} 
		} 
	return true;
	}
}
