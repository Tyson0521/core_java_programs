package sorting;

import java.util.Arrays;

public class BubbleSortingArray {
	public static void main(String[] args) {
		int[] a = {7,4,3,6,5,78,3,-9,2,1,0,11};
		
//		for(int i=0; i<a.length-1; i++) {
//			for(int j=1; j<a.length-i; j++) {
//				if(a[j-1]>a[j]) {
//					int temp = a[j-1];
//					a[j-1]=a[j];
//					a[j]=temp;
//				}
//			} 
//		} 
		
		for(int i=0; i<a.length; i++) {
			for(int j=1;j<a.length;j++) {
				if(a[j-1]>a[i]) {
					int temp = a[j-1];
					a[j-1]=a[i];
					a[i]=temp;
				}
			} 
		} 
		
		System.out.println(Arrays.toString(a));
	} 
}
