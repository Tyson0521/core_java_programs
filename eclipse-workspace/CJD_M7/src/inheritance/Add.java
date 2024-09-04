package inheritance;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int a,b ;
			System.out.println("Enter the value of a : ");
			a = scan.nextInt();
			System.out.println("Enter the value of b : ");
			b = scan.nextInt();
			
			System.out.println("Addition of a,b is : "+(a+b));
		}
		
	}

}
