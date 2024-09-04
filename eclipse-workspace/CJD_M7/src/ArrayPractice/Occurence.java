package ArrayPractice;

//import java.util.Arrays;
import java.util.Scanner;

public class Occurence {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the size of array:");
		int size = scan.nextInt();
		int[] a = new int[size];
		
		for(int i=0; i<a.length; i++) {
			System.out.println("Enter the values of a["+i+"]");
			a[i]=scan.nextInt();
		}

		int[] occur = new int[size];
		
		for(int i=0; i<a.length; i++) {
			int count=1;
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					count++;
					occur[j]=1;
				} 
			}
			if(occur[i]!=1) {//for Duplicate elements (&& count>1) n For unique elements (&& count==1)
				System.out.println(a[i]+" -> "+count);
			}
		}
		
	}
}
