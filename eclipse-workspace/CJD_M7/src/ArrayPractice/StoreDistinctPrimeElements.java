package ArrayPractice;

import java.util.Arrays;

public class StoreDistinctPrimeElements {
	public static void main(String[] args) {
		int[] a = {2,5,6,3,4,7,2,11,16,11,7};
		int size = 0;
		for(int i=0;i<a.length;i++) {
			if(checkPrime(a[i])) {
				size++;
			} 
		}
		int b[] = new int[size];
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(checkPrime(a[i])) {
				b[j++]=a[i];
			}
		}
		System.out.print("Prime elements : ");
		System.out.println(Arrays.toString(b));
		
		int count=0;
		for(int i=0;i<b.length;i++) {
			for(int k=0;k<b.length;k++) {
				if(b[i]==b[k] && i==k) {
					count++;
					break;
				} 
				if(b[i]==b[k] && i>k) {
					break;
				}
			}
		} 
		int[] distinct = new int[count];
		int index=0;
		for(int i=0;i<b.length;i++) {
			for(int k=0;k<b.length;k++) {
				if(b[i]==b[k] && i==k) {
					distinct[index++]=b[i];
					break;
				} 
				if(b[i]==b[k] && i>k) {
					break;
				}
			}
		}
		System.out.print("Distinct Prime elements : ");
		System.out.println(Arrays.toString(distinct));
		
		
	}
	
	public static boolean checkPrime(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2;i<=n/2; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
