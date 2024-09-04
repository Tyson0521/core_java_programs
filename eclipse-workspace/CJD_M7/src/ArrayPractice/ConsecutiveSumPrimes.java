package ArrayPractice;

import java.util.Scanner;

public class ConsecutiveSumPrimes {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the size of array:");
		int size = scan.nextInt();
		int[] a = new int[size];
		
		for(int i=0; i<a.length; i++) {
			System.out.println("Enter the values of a["+i+"]");
			a[i]=scan.nextInt();
		}
		
		int sum = a[0];
		for(int i=1;i<a.length;i++) {
			sum=sum+a[i];
			if(checkPrime(sum)) {
				System.out.println(sum);
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
