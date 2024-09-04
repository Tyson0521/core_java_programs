package ArrayPractice;

//import java.util.Arrays;
import java.util.Scanner;

public class FactorOfEachElements {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int a[] = {5,2,4,7,6,3,8};
		//int b[] = new int[19];
		
		//int count=0;
		for(int i=0 ; i<a.length; i++) {
			 getFactors(a[i]);
		}
		
		//System.out.println(Arrays.toString(b));
	}
	
	public static void getFactors(int n) {
		int size=0; 
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				size++; 
			}
		} 
		//System.out.println(size);
		int[] a = new int[size];
		for(int i=1,j=0; i<=n; i++) {
			if(n%i==0) {
				//a[j++]=i;
				System.out.print(i+" ");
			}
			
		}
		
//		return a;
//		for(int i : a) {
//			System.out.print(i+" ");
//		}
	}
	
}
