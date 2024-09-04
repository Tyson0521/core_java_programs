package sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = {3,5,4,3,8,9,6,5,1,0,9,8,65,490,32};
		
		for(int i=0; i<a.length-1; i++) {
			int minindex = i;
			for(int j=i+1; j<a.length; j++) {
				if(a[minindex]>a[j]) {
					minindex=j;
				}
			}
			int temp=a[minindex]; 
			a[minindex] = a[i];
			a[i] = temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
