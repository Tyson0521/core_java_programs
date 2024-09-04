package CheckedExceptions;

public class ArithematicExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Yoo");
		try {
			System.out.println(10+2);
			System.out.println(10/0);
			System.out.println("bye");
		} catch(ArithmeticException ae) {
			System.out.println("AE handlded...");
		}
		System.out.println("shubham..");
	}
}
