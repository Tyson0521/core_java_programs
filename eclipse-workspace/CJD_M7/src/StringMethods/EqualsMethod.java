package StringMethods;

import java.util.Scanner;

public class EqualsMethod {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String s = "Idli";
		String s1 = "idli";
		boolean b = s.equals(s1);
		
		if(b==true)
			System.out.println("The states are matched : "+b);
		else
			System.out.println("The states are not matched : "+b);
	}

}
