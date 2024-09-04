package arrayListPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayListProgram {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,2,1,3,6,4,5,1,2,7};
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<a.length; i++) {
			al.add(a[i]); 
		}
//		System.out.println(Arrays.toString(a));
//		System.out.println(al);
		
		
//		---------------------Printing Duplicate values-------------------------
		int occur[] = new int[al.size()];
		for(int i=0; i<al.size(); i++) {
			int count=1;
			for(int j=i+1;j<al.size(); j++) {
				if(al.get(i)==al.get(j)) {
					count++;
					occur[j]=1;
				}
			}
			if(occur[i]!=1 && count>1) {
				System.out.print(al.get(i)+" ");
			}
		}
		System.out.println();
		
//		---------------------Printing Unique values-------------------------
		for(int i=0; i<al.size(); i++) {
			int count=1;
			for(int j=i+1;j<al.size(); j++) {
				if(al.get(i)==al.get(j)) {
					count++;
					occur[j]=1;
					al.set(j, a[j]);
				}
			}
			if(occur[i]!=1 && count==1) {
				System.out.print(al.get(i)+" ");
			}
		}
		System.out.println();
		
//		---------------------Remove Duplicate values-------------------------
		for(int i=0; i<al.size(); i++) {
			int count=1;
			for(int j=i+1;j<al.size(); j++) {
				if(al.get(i)==al.get(j)) {
					count++;
					occur[j]=1;
					al.remove(j);
				}
			}
		}
		System.out.println(al);
		
//		----------------------------prime unique-------------------------------
		for(int i=0; i<al.size(); i++) {
			int count=1;
			for(int j=i+1;j<al.size(); j++) {
				if(al.get(i)==al.get(j) && prime(al.get(i))) {
					count++;
					occur[j]=1;
				}
			}
			if(occur[i]!=1 && count==1 && prime(al.get(i))) {
				System.out.print(al.get(i)+" ");
			}
		}
	}
	
	public static boolean prime(int n) {
		if(n<2)
			return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}
