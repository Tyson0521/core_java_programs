package lambdaExpression;

public class MessageUserLogic {
	public static void main(String[] args) {
		Message m = (s)->{
			System.out.println("Good morning "+s);
		};
		m.message("Vijay");
		
	}
}
