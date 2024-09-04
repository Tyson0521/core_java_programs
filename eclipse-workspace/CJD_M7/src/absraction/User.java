package absraction;

public class User {
	public static void main(String[] args) {
		B obj = new B(10,20);
		System.out.println(obj.i);
		System.out.println(obj.j);
		obj.dontKnow();
	}
}
