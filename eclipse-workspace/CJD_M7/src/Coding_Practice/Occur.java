package Coding_Practice;
import java.util.*;

public class Occur {	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] ans=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the values :");
			arr[i]=sc.nextInt();
		}
		
		int j=0;
		for(int i:arr) {
			ans[j++]=occur(i,arr);
		}
		System.out.println("Occurence of each elements: ");
		System.out.print("[");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+"->"+ans[i]+" ");
		}
		System.out.println("]");
	}


	public static int occur(int v, int[] arr) { //each element is again repeated here 
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(v==arr[i]) {
				c++;
			}
		}
		return c;
	}
	
	
}
