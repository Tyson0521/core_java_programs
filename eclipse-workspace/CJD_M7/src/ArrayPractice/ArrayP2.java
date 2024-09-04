package ArrayPractice;

import java.util.Scanner;


////count of characters in the array

public class ArrayP2 {
	static Scanner scan = new Scanner(System.in); 
	
	public static int[] count(char specialChar[]) {
		int c3=0,c1=0,c2=0;
		for(char c: specialChar) {
			if((c>='A' && c<='Z') || (c>='a' && c<='z')) {
				c1++;
			}else if(c>='0' && c<='9') {
				c2++;
			}else {
				c3++;
			}
		}
		int arr[]=new int[3];
		arr[0]=c1;
		arr[1]=c2;
		arr[2]=c3;
		return arr;
	}

	public static void main(String[] args) {
		System.out.println("Enter the size of the Array : ");
		int sizeOfArray = scan.nextInt();
		char specialChar[] = new char[sizeOfArray];
		
		for(int index=0;index<sizeOfArray;index++) {
			System.out.println("enter single char values: ");
			//scan.nextLine();
			specialChar[index] = scan.next().charAt(0);	
		}
		
//		int c3=0,c1=0,c2=0;
//		for(char c: specialChar) {
//			if((c>='A' && c<='Z') || (c>='a' && c<='z')) {
//				c1++;
//			}else if(c>='0' && c<='9') {
//				c2++;
//			}else {
//				c3++;
//			}
//		}
		
		int[] arr=count(specialChar);
		System.out.println("The no. of alphabets: "+arr[0]);
		System.out.println("The no. of numbers: "+arr[1]);
		System.out.println("The no. of specialcharacters: "+arr[2]);
	}
}
