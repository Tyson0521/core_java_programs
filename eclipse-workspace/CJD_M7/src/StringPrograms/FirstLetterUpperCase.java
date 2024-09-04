package StringPrograms;

public class FirstLetterUpperCase {

	public static void main(String[] args) {
		String s = "i am a java developer";
		String[] s1 = s.split(" ");
		String str = "";
		
		for(int i=0; i<s1.length; i++) {
			str = str + " "+convertUpperCase(s1[i]);
		}
		System.out.println(str.trim()); 
	}
	
	public static String convertUpperCase(String s) {
		String n = (s.charAt(0)+"").toUpperCase();
		for(int i=1; i<s.length(); i++) {
			n=n+(s.charAt(i)+"").toLowerCase();
		}
	return n;
	}

}
