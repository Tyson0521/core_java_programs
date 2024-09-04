package ExceptionObjectPropagation;

public class ObjectPropagation {
	
	public static void main(String[] args) {
		System.out.println("Main Begin.!!");
		
		try {
			add();
			System.out.println("Main Ends.!!");
		}
		catch(ArithmeticException e) {
			System.out.println("AE handled....");
		}
	}
	
	public static void add() {
		System.out.println("Add method Begin.!!");
		try {
			run();
			System.out.println("Main Ends.!!");
		}
		catch(ArithmeticException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
			System.out.println("AE handled....");
		}
		
	}
	
	public static void run() {
		System.out.println("Run method Begin.!!");
		System.out.println(10/0);
		System.out.println("Run method Ends.!!");
	}
}
