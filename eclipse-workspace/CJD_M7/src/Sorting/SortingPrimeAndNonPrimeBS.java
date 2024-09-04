package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortingPrimeAndNonPrimeBS {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int[] a = {6,3,4,2,1,0,7,9,11,10,15,5};
		int[] b = new int[a.length];
		int k=0;
		for(int i : a) {
			if(checkPrime(i)) {
				b[k++]=i;
			}
		}
		for(int i=0;i<a.length;i++) {
			if(!checkPrime(a[i])){
				b[k++] = a[i];
			} 
		}
		//Sorting
		int count=0;
		for(int i=0; i<b.length-1; i++) {
			for(int j=1; j<b.length-i; j++) {
				if(b[j-1]>b[i] && checkPrime(b[j-1]) && checkPrime(b[i])) {
					int temp=b[j-1];
					b[j-1]=b[i];
					b[i]=temp;
					count++;
				}
			}
			for(int n=count; n<b.length-1; n++) {
				if(b[n]>b[n+1] && !checkPrime(b[n]) && !checkPrime(b[n+1])) {
					int temp2 = b[n];
					b[n]= b[n+1]; 
					b[n+1]=temp2;
				}
			} 
		}
		System.out.println(count);
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
