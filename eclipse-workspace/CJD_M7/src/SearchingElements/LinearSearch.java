package SearchingElements;

import java.util.Arrays;

public class LinearSearch {
	public static void main(String[] args) {
		int[] a = {5,6,20,11,3,17};
		int index = -1;
		int n = 11;
		
		for (int i = 0; i<a.length; i++) {
			if(n==a[i]) {
				index = i;
				break;
			}
		} 
		if(index==-1) {
			System.out.println("The element "+n+" is not present in "+Arrays.toString(a));
		} else {
			System.out.println("The element "+n+" is present in "+Arrays.toString(a));
		}
	}

}
