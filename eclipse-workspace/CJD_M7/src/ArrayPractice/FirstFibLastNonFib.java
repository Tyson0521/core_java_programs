package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class FirstFibLastNonFib {
	
	static Scanner scan= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter the size of array:");
		int size = scan.nextInt();
		int[] a = new int[size];
		
		for(int i=0; i<a.length; i++) {
			System.out.println("Enter the values of a["+i+"]");
			a[i]=scan.nextInt();
		}
		
		//int[] a= {5,2,4,7,6,3,8};
		int[] b= new int[a.length];
		
		int k =0;
		for(int i : a) {
			if(checkFib(i)) {
				b[k++]=i;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			if(!checkFib(a[i])){
				b[k++] = a[i];
			} 
		} 
		System.out.println(Arrays.toString(b));
	}
	 
	public static boolean checkFib(int i) {
		int a=0;
		int b=1;
		int c=0;
		if(i==a) {
			return true;
		} else if(i==b) {
			return true;
		} else {
			while((a+b)<=i) {
				c=a+b;
				a=b;
				b=c;
			} 
		return c==i;
		}	
	}
	
}
