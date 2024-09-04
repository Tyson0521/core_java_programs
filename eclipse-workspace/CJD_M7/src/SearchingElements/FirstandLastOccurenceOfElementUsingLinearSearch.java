package SearchingElements;

public class FirstandLastOccurenceOfElementUsingLinearSearch {
	public static void main(String[] args) {
		int[] a = {5,2,3,2,1,1,7,3,1,2,3,1,5};
		int n = 1;
		int index1 = -1;
		int index2 = -1;
		int f=0;
		
		for (int i = 0; i < a.length; i++) {
			if(n==a[i]) {
				if(index1==-1) {
					index1=i;
				}
			index2=i;
			}
		}
		System.out.println(index1+" , "+index2);
		
	}

}
