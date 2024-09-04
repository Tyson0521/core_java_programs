package ArrayPractice;

import java.util.Arrays;

public class SwapFirstWithLastElements {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		
		for(int i=0,j=a.length-1; i<=a.length/2; i++, j--) {
			int temp = a[i];
			a[i]=a[j];
			a[j]= temp;
			
		}
		
		System.out.println(Arrays.toString(a));
 	}
}
