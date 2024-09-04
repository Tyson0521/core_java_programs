package NumbersPrograms;

import java.util.Scanner;

public class AscendingOrderOfNum {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Number :");
		int n = scan.nextInt();
		
		int rem = 0; 
		int ans = 0;
		for(int i=1; i<=9; i++) {
			int n1 = n;
			while(n1!=0) {
				rem = n1%10;
				if(rem==i) {
					ans = ans*10 + rem;
				}
			n1/=10;
			}
		}
		System.out.println(ans);
		
	}

}
