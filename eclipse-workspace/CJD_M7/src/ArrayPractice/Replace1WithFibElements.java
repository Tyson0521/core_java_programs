package ArrayPractice;

import java.util.Arrays;

public class Replace1WithFibElements {
	public static void main(String[] args) {
		int[] a= {5,2,4,7,6,3,8};
		int[] b= new int[a.length];
				
		for(int i=0;i<a.length;i++) {
			if(checkFib(a[i])){
				b[i]=1;
			} 
		} 
		System.out.println(Arrays.toString(b));
	}
	 
	public static boolean checkFib(int i) {
		int a=0;
		int b=1;
		int c=0;
		if(i==a) {
			return true;
		} else if(i==b) {
			return true;
		} else {
			while((a+b)<=i) {
				c=a+b;
				a=b;
				b=c;
			} 
		return c==i;
		}	
	}
	
}