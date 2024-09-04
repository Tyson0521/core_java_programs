package StringPrograms;

import java.util.Scanner;

public class SumOfOnlyDigitsFromString {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the Words :");
		String s = scan.nextLine();
		
		int sum=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				char ch ='0';
				int temp1 = s.charAt(i);
				int temp2 = temp1 - (int)ch;
				sum=sum+temp2; 
				//System.out.print(temp1 - ch);
			} 
			
		}
		System.out.println();
		System.out.println("The sum of Digits from given String is :"+sum);
	}

}
