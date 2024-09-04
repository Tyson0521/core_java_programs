package SearchingElements;

public class BinarySearch {
	public static void main(String[] args) {
		
		//only works when elements are in sorted order
		int[] a = {1,3,6,8,9,12};
		int n = 12;
		int firstIndex = 0;
		int lastIndex = a.length-1;
		int mid = (firstIndex+lastIndex)/2;
		
		while(firstIndex<=lastIndex) {
			if(n==a[mid]) {
				System.out.println("Element "+n+" is found.");
				break;
			} else if(n>a[mid]) {
				firstIndex = mid+1;
			} else if(n<a[mid]) {
				lastIndex = mid-1;
			}
			mid = (firstIndex+lastIndex)/2;
		}
		
		if(firstIndex>lastIndex) {
			System.out.println("Element "+n+" is Not found.");
		}
		
	}
}
