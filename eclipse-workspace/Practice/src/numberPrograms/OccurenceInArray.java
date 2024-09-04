package numberPrograms;

public class OccurenceInArray {
	public static void main(String[] args) {
		int[] a = {1,4,5,8,4,5,2,3,1,0,1,2,5,2,1};
		int[] occur = new int[a.length];
		
		for(int i=0; i<a.length; i++) {
			int count = 1;
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					occur[j]=1;
					count++;
				}
			}
			if(occur[i]!=1) {
				System.out.println(a[i]+ " occured : "+count);
			}
		}
		
		
	}
}
