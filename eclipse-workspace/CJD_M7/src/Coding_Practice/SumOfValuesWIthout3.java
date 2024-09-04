package Coding_Practice;

import java.util.Scanner;

public class SumOfValuesWIthout3 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter the initial value : ");
		int n = sc.nextInt();
		System.out.print("Enter the final value : ");
		int m = sc.nextInt();
		System.out.print("Result of sum : ");
		int res = check(n,m);
		System.out.println(res);
		
	}
	
	public static int check(int n, int m) {
		int sum = 0;
		for(int i=n;i<=m;i++) {
			int t = n;
			int count = 0;
			while (t!=0) {
				int r = t%10;
				if (r==3) {
					count++;
				}
			t/=10;
			} 	
			if(count==0) {
				sum = sum+i;
			}
		}
	return sum;
	}

}
