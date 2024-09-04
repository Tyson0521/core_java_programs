package sorting;

public class SecondHighestInArray {
	public static void main(String[] args) {
		int[] a = {3,5,4,3,8,9,6,5,1,0,9,8,65,32};

		int max = a[0];
		int index = -1;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				index = i;
				max = a[i];
			}
		}
		System.out.println(a[index]);
		int min = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>min && a[i]<max) {
				min = a[i];
			}
		}
		System.out.println(min);
	}
}
