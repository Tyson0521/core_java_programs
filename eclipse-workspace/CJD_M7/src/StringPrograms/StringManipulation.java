package StringPrograms;

import java.util.Scanner;

public class StringManipulation {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		String s = scan.nextLine();
		System.out.println(evenodd(s)+" --> Even first odd next");
		System.out.println(isVowel(s)+" --> Vowels First");
		System.out.println(isUpperCaseVowel(s)+" --> Vowels UpperCase at their Position itself");
		System.out.println(toggleCase(s)+" --> Next index as UpperCase");
		System.out.println(isPrime(s)+" --> Prime index first");
		
	}
	
	public static String evenodd(String s) {
		String even = "";
		String odd = "";
		for(int i=0; i<s.length(); i++) {
			if(i%2==0) {
				even = even + s.charAt(i);
			} else {
				odd = odd + s.charAt(i);
			}
		}
		s = even + odd;
		return s;
	}
	
	public static String isVowel(String s) {
		String v = ""; 
		String nV = "";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'
			   || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') {
				v = v+s.charAt(i);
			} else {
				nV = nV + s.charAt(i);
			}
		}
		s = v+nV;
		return s;
	}
	
	public static String isUpperCaseVowel(String s) {
		String v = "";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				v = v + (char)(s.charAt(i)-32);
			} else {
				v = v + s.charAt(i);
			}
		}
		
		return v;
	}
	
	public static String toggleCase(String s) {
		String t="";
		for(int i=0; i<s.length(); i++) {
			if(i%2!=0) {
				t = t + (char)(s.charAt(i)-32);
			} else {
				t = t + s.charAt(i);
			}
			
		}
	return t;
	}
	
	public static String isPrime(String s) {
		String p="";
		String np="";
		for(int i=0; i<s.length(); i++) {
			if(prime(i)) {
				p=p+s.charAt(i);
			} else {
				np=np+s.charAt(i);
			}
		}
	return p+np;
	}
	
	public static boolean prime(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2; i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;	
	}
	

}
