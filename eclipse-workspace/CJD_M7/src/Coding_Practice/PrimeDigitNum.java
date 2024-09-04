package Coding_Practice;

import java.util.Scanner;

public class PrimeDigitNum {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter the value : ");
		int i = sc.nextInt();
		System.out.println(check(i));
	}
	
	public static int check(int n) {
		int t=n;
		int res=0;
		for(int i=1;i<=n;i++) {
				while (t!=0) {
					int rem = t%10;
					if(prime(rem)) {
						res = res*10+rem;
					}
					t/=10;
				}
		} 
		return res;	
	}
	
	public static boolean prime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			} 
		}
		return count==2;
	}
	
//	public static int reverse(int n) {
//		
//	}
//	
//53876412
}
