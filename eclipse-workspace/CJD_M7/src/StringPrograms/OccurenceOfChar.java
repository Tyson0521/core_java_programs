package StringPrograms;

import java.util.Scanner;

public class OccurenceOfChar {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String s = "java";
		
		int[] occur = new int[s.length()];
		
//		for(int i=0; i<s.length(); i++) {
//			int count=1;
//			for(int j=i+1; j<s.length(); j++) {
//				if(s.charAt(i)==s.charAt(j)) {
//					count++;
//					occur[j]=1;
//				} 
//			} 
//			if(occur[i]!=1) {//for Duplicate elements (&& count>1) n For unique elements (&& count==1)
//				System.out.println(s.charAt(i)+" occurs : "+count);
//			}
//		}
		
		for(int i=0;i<s.length(); i++) {
			int count=0;
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(i)==s.charAt(j) && i>j) {
					break;
				}
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(s.charAt(i)+" occurs : "+count);
			}
		}
		
	}
}

