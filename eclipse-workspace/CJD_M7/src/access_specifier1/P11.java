package access_specifier1;

public class P11 {
	int i ;

	protected P11(int i) { //protected constructor can be used only within the class itself
		super();
		this.i = i;
	}
	
	public static void main(String[] args) {
		System.out.println(P1.i);
		P1 obj = new P1(35);
		System.out.println(obj.j);
	}
}