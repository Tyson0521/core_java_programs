package StringPrograms;

public class DsitinctCharIndexOf {
	public static void main(String[] args) {
		String s = "javavava";
		String s2 = "";
		
		//using indexOf
		for(int i=0 ; i<s.length(); i++) {
			if(s.indexOf(s.charAt(i))>=s.indexOf(s.charAt(i),i)) {
				s2+=s.charAt(i);
			}
		} 
		System.out.println(s2);
		
	}

}
