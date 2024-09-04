package StringMethods;

import java.util.Scanner;

public class IndexOfMethod {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Words :");
		String s = scan.nextLine();
		
		//indexOf is a Overloaded method
		System.out.println("The index of 'e' in given string is : "+s.indexOf('e'));
		System.out.println("The index of 'z' in given string is : "+s.indexOf('z'));
		System.out.println("The index of 'e' from position 2 is : "+s.indexOf('e',2));
		System.out.println("The index of 'eve' in given string is : "+s.indexOf("eve"));
		System.out.println("The index of 'eve' from position 5 is : "+s.indexOf("eve",5));
		
	}

}
