package arrays;

public class LongestSubSequentArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,2,3,4,5,6,7,6,7,8,4,5,6};
		int count = 1;
		int maxCount=0;
		int findex = 0;
		int lindex = -1;
		int fi = -1;
		
		for(int i=0; i<a.length-1; i++) {
			if(a[i]+1==a[i+1]) {
				count++;
			} 
			else {
				count=1;
				fi=i+1;
			}
			
			if(count>maxCount) {
				maxCount=count;
				findex = fi;
				lindex = i+1;
			}
		}
		
		for(int i=findex; i<lindex; i++) {
			System.out.println(a[i]);
		}
		
	}
}
