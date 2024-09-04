package StringPrograms;

//import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the String 1 :");
		String s1 = scan.nextLine();
		System.out.println("Enter the String 2 : ");
		String s2 = scan.nextLine();
		
		if(s1.length()==s2.length()) {
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			ch1 = isSort(ch1);
			ch2 = isSort(ch2);
			
//			System.out.println(Arrays.toString(ch1));
//			System.out.println(Arrays.toString(ch2));
			
			int count = 0;
			for(int i=0; i<ch1.length; i++) {
				if(ch1[i]==ch2[i]) {
					count++;
				} else {
					break;
				}
			}
			if(count==ch1.length) {
				System.out.println("The Strings "+s1+" and "+s2+" are Anagram");
			} else {
				System.out.println("The Strings "+s1+" and "+s2+" are Not Anagram");
			}
			
		} else {
			System.out.println("The Strings "+s1+" and "+s2+" are Not Anagram");
		}
		

	}
	
	public static char[] isSort(char[] ch) { 
		for(int i=0; i<ch.length-1; i++) {
			int min=i;
			for(int j=i+1; j<ch.length; j++) {
				if(ch[min]>ch[j]) {
					min=j;
				}
			}
			char temp = ch[min];
			ch[min] = ch[i];
			ch[i] = temp;
		}
		return ch; 
	}

}
