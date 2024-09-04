package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class FirstPrimeLastNonPrime {
	
	static Scanner scan= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter the size of array:");
//		int size = scan.nextInt();
//		int[] a = new int[size];
//		
//		for(int i=0; i<a.length; i++) {
//			System.out.println("Enter the values of a["+i+"]");
//			a[i]=scan.nextInt();
//		}
		
		
		int[] a= {5,2,4,7,6,3,8};
		int[] b= new int[a.length];
		
		int k =0;
		for(int i : a) {//First Prime elements
			if(checkPrime(i)) {
				b[k++]=i;
			}
		}
		for(int i=0;i<a.length;i++) {//Second Non Prime Elements
			if(!checkPrime(a[i])){
				b[k++] = a[i];
			} 
		} 
		System.out.println(Arrays.toString(b));
		
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
