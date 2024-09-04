package stringProgram;

public class DistinctChar {
	public static void main(String[] args) {
		String s = "javajacaba";
		String str = "";
		
		for(int i=0; i<s.length(); i++) {
			if(s.indexOf(s.charAt(i))>=s.indexOf(s.charAt(i), i)) {
				str=str+s.charAt(i);
			}
		} 
		System.out.println(str);
	}
}
