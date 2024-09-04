package CheckedExceptions;

public class NumberFormatExcep {
	public static void main(String[] args) {
		String s = "100";
		int i = Integer.parseInt(s);
		System.out.println(i);
		
		try {
			String s1 = "I love u 3000";
			System.out.println(Integer.parseInt(s1));
		}
		catch(NumberFormatException n) {
			System.out.println("Number format exception handled...");
		}
		
		System.out.println(">>>>shubham<<<<");
		
	}
}
