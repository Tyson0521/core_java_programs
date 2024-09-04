package Coding_Practice;

import java.util.Scanner;

public class FibSeries {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter the initial value 1 : ");
		int i = sc.nextInt();
		System.out.print("Enter the initail value 2 : ");
		int j = sc.nextInt();
		System.out.print("End value of series : ");
		int k = sc.nextInt();
		checkFib(i,j,k);
	}
	
	public static void checkFib(int i, int j, int k) {
		System.out.println("The fib series of given values is : ");
		System.out.println(i);
		System.out.println(j);
		int a=0;
		
		while((i+j)<=k) {
			a = i+j;
			System.out.println(a);
			i=j;
			j=a;
		}	
	}

}
