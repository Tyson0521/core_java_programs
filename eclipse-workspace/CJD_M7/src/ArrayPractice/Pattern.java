package ArrayPractice;
import java.util.*;

public class Pattern {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("enter the number :");
		int n=sc.nextInt();
		int [] a=new int[n*n];
		
		int s=n,k=0,m=0;
		for(int i=0;i<n;i++) {
			s--;
			k++;
			for(int j=0;j<s;j++) {
				a[m++]=0;
			}
			for(int j=k;j>0;j--) {
				a[m++]=j;
			}
		}
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
}
