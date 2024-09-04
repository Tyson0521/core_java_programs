package StringMethods;

import java.util.Scanner;

public class EqualsIgnoreCaseMethod {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		//System.out.println("Enter the Words :");
		String s = "Idli";
		String s1 = "idli";
		
		if(s.equalsIgnoreCase(s1))
			System.out.println("The states are same : "+s+" = "+s1);
		else 
			System.out.println("The states are not same : "+s+"!="+s1);
	
	}

}
