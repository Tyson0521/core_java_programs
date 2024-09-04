package ArrayPractice;

import java.util.Scanner;

public class ConsecutiveSumFibSer {
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
			if(checkFib(sum)) {
				System.out.println(sum);
			}
		}
		
	}
	
	public static boolean checkFib(int n) {
		int a=0,b=1,c=a+b;
		if(n==0) {
			return true;
		} 
		while(c<=n){
			if(c==n) {
				return true;
			}
			a=b;
			b=c;
			c=a+b;
		} 
	return false;
	}

}
