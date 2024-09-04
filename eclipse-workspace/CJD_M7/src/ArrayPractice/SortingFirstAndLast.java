package ArrayPractice;

import java.util.Arrays;

public class SortingFirstAndLast {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		int[] b = new int[a.length];
		int k=0;
		for(int i=0,j=a.length-1; i<a.length/2; i++,j--) {
			b[k++]=a[i];
			b[k++]=a[j];
			}
		if(a.length%2!=0) {
			b[k++]=a[a.length/2];	
		}
		System.out.println(Arrays.toString(b));
	}
}
